/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.fitlifegym_persistencia.entidades.Alergia;
import com.mycompany.fitlifegym_persistencia.entidades.UnidadMedida;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class UnidadMedidaDAO implements IUnidadMedidaDAO{

    private static final Logger LOGGER = Logger.getLogger(UnidadMedidaDAO.class.getName());
    
    private MongoCollection<UnidadMedida> coleccionUnidadMedida;
    
    public UnidadMedidaDAO(){
        this.coleccionUnidadMedida = ConexionMongoDB.obtenerBaseDatos().getCollection("unidadMedida", UnidadMedida.class);
    }

    @Override
    public List<UnidadMedida> consultarUnidadMedida() throws PersistenciaException {
        try{
            return coleccionUnidadMedida.find().into(new ArrayList<>());
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al consultar la unidad de medida: "+ex.getMessage());
        }
    }

    @Override
    public UnidadMedida consultarUniMedidaPorID(String idUnidadMedida) throws PersistenciaException {
        try{
            return coleccionUnidadMedida.find(Filters.eq("_id", idUnidadMedida)).first();
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al consultar la unidad de medida por ID: "+ex.getMessage());
        }
    }
    
}
