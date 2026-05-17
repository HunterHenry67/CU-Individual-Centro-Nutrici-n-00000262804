/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_negocio;

import com.mycompany.fitlifegym_dtos.DietaDTO;
import com.mycompany.fitlifegym_persistencia.DietasDAO;
import com.mycompany.fitlifegym_persistencia.IDietaDAO;
import com.mycompany.fitlifegym_persistencia.PersistenciaException;
import com.mycompany.fitlifegym_persistencia.entidades.Dieta;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author BALAMRUSH
 */
public class DietaBO implements IDietasBO {

    private static final Logger LOGGER = Logger.getLogger(DietaBO.class.getName());

    private final IDietaDAO dietaDAO;

    public DietaBO() {
        this.dietaDAO = new DietasDAO();
    }

    @Override
    public Dieta registrarDieta(Dieta dieta) throws NegocioException {
        try{
            if(dieta == null){
                throw new NegocioException("La dieta no puede estar vacía.");
            }
            if(dieta.getIdPaciente() == null || dieta.getIdPaciente().trim().isEmpty()){
                throw new NegocioException("La dieta debe tener un paciente asignado.");
            }
            return dietaDAO.registrarDieta(dieta);
        }catch(PersistenciaException ex){
            LOGGER.severe(ex.getMessage());
            throw new NegocioException("Error al querer validar la dieta: "+ex.getMessage());
        }
    }

    @Override
    public Dieta consultarDietaPaciente(String idPaciente) throws NegocioException {
       try{
           if(idPaciente == null || idPaciente.trim().isEmpty()){
               throw new NegocioException("El identificador del paciente es obligatorio.");
           }
           return dietaDAO.consultarDietaPaciente(idPaciente);
       }catch(PersistenciaException ex){
           LOGGER.severe(ex.getMessage());
           throw new NegocioException("Error al consultar el histroial de dietas."+ex.getMessage());
       }
    }

    @Override
    public List<Dieta> consultarDietas() throws NegocioException {
        try{
            List<Dieta> dietas = dietaDAO.consultarDietas();
            return dietas;
        }catch(PersistenciaException ex){
            LOGGER.severe(ex.getMessage());
            throw new NegocioException("Error al consultra las dietas."+ex.getMessage());
        }
    }

    @Override
    public void eliminarDieta(String idDieta) throws NegocioException {
        try{
            if(idDieta == null || idDieta.trim().isEmpty()){
                throw new NegocioException("Favor de colocar el id del paciente para eliminar la dieta.");
            }
            dietaDAO.eliminarDieta(idDieta);
        }catch(PersistenciaException ex){
            LOGGER.severe(ex.getMessage());
            throw new NegocioException("No fue posible eliminar la la dieta: "+ex.getMessage());
        }
    }

    

    @Override
    public List<Dieta> buscarDietaFiltro(String tipoFiltro, String valor) throws NegocioException {
        try{
            if(tipoFiltro == null || valor == null || valor.trim().isEmpty()){
                throw new NegocioException("Se debe de colocar un filtro y un vakor para poder realizar la búsqueda.");
            }
            return dietaDAO.buscarDietaFiltro(tipoFiltro, valor);
        }catch(PersistenciaException ex){
            LOGGER.severe(ex.getMessage());
            throw new NegocioException("Ocurrió un error al filtar la dietas: "+ex.getMessage());
        }
    }

    

}
