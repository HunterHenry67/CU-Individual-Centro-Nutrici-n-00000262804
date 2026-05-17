/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.fitlifegym_persistencia.entidades.Alergia;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class AlergiaDAO implements IAlergiaDAO{

    private static final Logger LOGGER = Logger.getLogger(AlergiaDAO.class.getName());
    
    private MongoCollection<Alergia> coleccionAlergia;
    
    public AlergiaDAO(){
        this.coleccionAlergia = ConexionMongoDB.obtenerBaseDatos().getCollection("alergia", Alergia.class);
    }
    @Override
    public List<Alergia> consultarAlergia() throws PersistenciaException {
        try{
            return coleccionAlergia.find().into(new ArrayList<>());
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al consultar alergia: "+ex.getMessage());
        }
    }

    @Override
    public Alergia consultarAlergiaPorID(String idAlergia) throws PersistenciaException {
        try{
            return coleccionAlergia.find(Filters.eq("_id", idAlergia)).first();
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al consultar la alergia por ID: "+ex.getMessage());
        }
    }

}
