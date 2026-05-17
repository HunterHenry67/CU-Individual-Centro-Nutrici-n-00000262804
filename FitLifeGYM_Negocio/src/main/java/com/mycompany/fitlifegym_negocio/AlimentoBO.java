/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_negocio;

import Adapter.DtosAEntidadesAdapter;
import com.mycompany.fitlifegym_dtos.AlimentoDTO;
import com.mycompany.fitlifegym_persistencia.IPersistenciaDAO;
import com.mycompany.fitlifegym_persistencia.PersistenciaDAO;
import com.mycompany.fitlifegym_persistencia.PersistenciaException;
import com.mycompany.fitlifegym_persistencia.entidades.Alimento;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author BALAMRUSH
 */
public class AlimentoBO implements IAlimentoBO{

    private static final Logger LOGGER = Logger.getLogger(AlimentoBO.class.getName());
    
    private final IPersistenciaDAO persistenciaFachada;
    private final DtosAEntidadesAdapter adapter;
    
    public AlimentoBO(){
        this.persistenciaFachada = new PersistenciaDAO();
        this.adapter = new DtosAEntidadesAdapter();
    }

    @Override
    public List<AlimentoDTO> consultarAlimento() throws NegocioException {
        try{
            List<Alimento> alimentos = persistenciaFachada.consultarAlimento();
            List<AlimentoDTO> listaDtos = new ArrayList<>();
            if(alimentos != null){
                for(Alimento entidad : alimentos){
                    listaDtos.add(adapter.adaptarAlimentosEntidad(entidad));
                }
            }
            return listaDtos;
        }catch(PersistenciaException ex){
            LOGGER.severe(ex.getMessage());
            throw new NegocioException("No se pudo consultar los alimentos: "+ex.getMessage());
        }
    }

    @Override
    public AlimentoDTO buscarAlimentoPorNombre(String nombreAlimento) throws NegocioException {
        try{
            if(nombreAlimento == null || nombreAlimento.trim().isEmpty()){
                throw new NegocioException("Debe de colocar el nombre de un alimento para buscarlo.");
            }
            Alimento alimentoEntidad = persistenciaFachada.buscarAlimentoPorNombre(nombreAlimento);
            return adapter.adaptarAlimentosEntidad(alimentoEntidad);
        }catch(PersistenciaException ex){
            LOGGER.severe(ex.getMessage());
            throw new NegocioException("No se puedo buscar el alimento por nombre: "+ex.getMessage());
        }
    }

    @Override
    public AlimentoDTO consultarAlimentoPorID(String idAlimento) throws NegocioException {
        try{
            if(idAlimento == null || idAlimento.trim().isEmpty()){
                throw new NegocioException("El id no puede estar vacía.");
            }
            Alimento alimentoEntidad = persistenciaFachada.consultarAlimentoPorID(idAlimento);
            return adapter.adaptarAlimentosEntidad(alimentoEntidad);
        }catch(PersistenciaException ex){
            LOGGER.severe(ex.getMessage());
            throw new NegocioException("No se pudo consultar el alimento por ID: "+ex.getMessage());
        }
    }
    
}
