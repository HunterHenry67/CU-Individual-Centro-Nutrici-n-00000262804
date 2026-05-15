/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mongodb.client.MongoCollection;
import com.mycompany.fitlifegym_persistencia.entidades.DatosBiologicos;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class DatosBiologicosDAO implements IDatosBiologicosDAO{

    private static final Logger LOGGER = Logger.getLogger(DatosBiologicosDAO.class.getName());
    
    private MongoCollection coleccionDatosBio;
    
    public DatosBiologicosDAO(){
        this.coleccionDatosBio = ConexionMongoDB.obtenerBaseDatos().getCollection("datosBiologicos", DatosBiologicos.class);
    }
   

    @Override
    public DatosBiologicos registrarDatosBiologicos(DatosBiologicos datosBiologicos) throws PersistenciaException {
        try{
            coleccionDatosBio.insertOne(this)
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al registrar los datos biologicos: "+ ex.getMessage());
        }
    }

    @Override
    public List<DatosBiologicos> consultarDatosBiologicos(Long idPaciente) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
