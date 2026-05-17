/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.fitlifegym_persistencia.entidades.Alimento;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class AlimentoDAO implements IAlimentoDAO{  
    
    private MongoCollection<Alimento> coleccionAlimento;
    private static final Logger LOGGER = Logger.getLogger(AlimentoDAO.class.getName());
    
    
    
    public AlimentoDAO(){
        this.coleccionAlimento = ConexionMongoDB.obtenerBaseDatos().getCollection("alimentos", Alimento.class);
    }

    @Override
    public List<Alimento> consultarAlimento() throws PersistenciaException {
        try{
            return coleccionAlimento.find().into(new ArrayList<>());
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al consultar un alimento: "+ ex.getMessage());
        }
    }

    @Override
    public Alimento buscarAlimentoPorNombre(String nombreAlimento) throws PersistenciaException {
        try{
            return coleccionAlimento.find(Filters.regex("nombreAlimento", nombreAlimento, "i")).first();
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al consultar el alimento: "+ex.getMessage());
        }
    }

    @Override
    public Alimento consultarAlimentoPorID(String idAlimento) throws PersistenciaException {
        try{
            return coleccionAlimento.find(Filters.eq("_id", idAlimento)).first();
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al consultar el alimento por id: "+ex.getMessage());
        }
    }

  
}
