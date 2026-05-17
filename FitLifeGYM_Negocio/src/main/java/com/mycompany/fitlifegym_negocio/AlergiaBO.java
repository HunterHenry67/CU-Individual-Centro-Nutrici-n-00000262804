/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_negocio;

import Adapter.DtosAEntidadesAdapter;
import com.mycompany.fitlifegym_dtos.AlergiaDTO;
import com.mycompany.fitlifegym_persistencia.AlergiaDAO;
import com.mycompany.fitlifegym_persistencia.IAlergiaDAO;
import com.mycompany.fitlifegym_persistencia.IPersistenciaDAO;
import com.mycompany.fitlifegym_persistencia.PersistenciaDAO;
import com.mycompany.fitlifegym_persistencia.PersistenciaException;
import com.mycompany.fitlifegym_persistencia.entidades.Alergia;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author BALAMRUSH
 */
public class AlergiaBO implements IAlergiaBO{

    private static final Logger LOGGER = Logger.getLogger(AlergiaBO.class.getName());
    
    private final IPersistenciaDAO persistenciaFachada;
    private final DtosAEntidadesAdapter adapter;
    
    public AlergiaBO(){
        this.persistenciaFachada = new PersistenciaDAO();
        this.adapter = new DtosAEntidadesAdapter();
    }

    @Override
    public List<Alergia> consultarAlergia() throws NegocioException {
        try{
            List<Alergia> alergias = persistenciaFachada.consultarAlergia();
            List<AlergiaDTO> listaDtos = new ArrayList<>();
            if(alergias != null){
                for(Alergia entidad : alergias){
                    listaDtos.add(adapter.adaptarAlimentosEntidad(entidad));
                }
            }
            return 
        }catch(PersistenciaException ex){
            throw new NegocioException("No se pudo consultar todas las alergias: "+ex.getMessage());
        }
    }

    @Override
    public Alergia consultarAlergiaPorID(String idAlergia) throws NegocioException {
        try{
            if(idAlergia == null || idAlergia.trim().isEmpty()){
                throw new NegocioException("Debe de colocar un id para realizar la búsqueda.");
            }
            return alergiaDAO.consultarAlergiaPorID(idAlergia);
        }catch(PersistenciaException ex){
            LOGGER.severe(ex.getMessage());
            throw new NegocioException("No se pudo consultar la alergia por id: "+ex.getMessage());
        }
    }
    
}
