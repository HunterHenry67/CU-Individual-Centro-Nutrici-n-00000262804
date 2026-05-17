/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_negocio;

import com.mycompany.fitlifegym_persistencia.AlimentoDAO;
import com.mycompany.fitlifegym_persistencia.IAlimentoDAO;
import com.mycompany.fitlifegym_persistencia.PersistenciaException;
import com.mycompany.fitlifegym_persistencia.entidades.Alimento;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author BALAMRUSH
 */
public class AlimentoBO implements IAlimentoBO{

    private static final Logger LOGGER = Logger.getLogger(AlimentoBO.class.getName());
    
    private final IAlimentoDAO alimentosDAO;
    
    public AlimentoBO(){
        this.alimentosDAO = new AlimentoDAO();
    }

    @Override
    public List<Alimento> consultarAlimento() throws NegocioException {
        try{
            List<Alimento> alimentos = alimentosDAO.consultarAlimento();
            return alimentos;
        }catch(PersistenciaException ex){
            LOGGER.severe(ex.getMessage());
            throw new NegocioException("No se pudo consultar los alimentos: "+ex.getMessage());
        }
    }

    @Override
    public Alimento buscarAlimentoPorNombre(String nombreAlimento) throws NegocioException {
        try{
            if(nombreAlimento == null || nombreAlimento.trim().isEmpty()){
                throw new NegocioException("Debe de colocar el nombre de un alimento para buscarlo.");
            }
            return alimentosDAO.buscarAlimentoPorNombre(nombreAlimento);
        }catch(PersistenciaException ex){
            LOGGER.severe(ex.getMessage());
            throw new NegocioException("No se puedo buscar el alimento por nombre: "+ex.getMessage());
        }
    }

    @Override
    public Alimento consultarAlimentoPorID(String idAlimento) throws NegocioException {
        try{
            if(idAlimento == null || idAlimento.trim().isEmpty()){
                throw new NegocioException("El id no puede estar vacía.");
            }
            return alimentosDAO.consultarAlimentoPorID(idAlimento);
        }catch(PersistenciaException ex){
            LOGGER.severe(ex.getMessage());
            throw new NegocioException("No se pudo consultar el alimento por ID: "+ex.getMessage());
        }
    }
    
}
