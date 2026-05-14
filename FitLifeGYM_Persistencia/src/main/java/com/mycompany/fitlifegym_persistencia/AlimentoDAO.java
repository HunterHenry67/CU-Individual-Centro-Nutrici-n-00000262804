/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mongodb.client.MongoCollection;
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
    public List<Alimento> consultarAlimento(String nombreAlimento) throws PersistenciaException {
        try{
            return coleccionAlimento.find().into(new ArrayList<>());
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al consultar un alimento: "+ ex.getMessage());
        }
    }

    @Override
    public List<Alimento> consultarAlimento() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}
