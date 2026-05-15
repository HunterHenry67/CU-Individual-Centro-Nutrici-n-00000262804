/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mongodb.client.MongoCollection;
import com.mycompany.fitlifegym_persistencia.entidades.Padecimiento;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class PadecimientoDAO implements IPadecimientoDAO{

    private static final Logger LOGGER = Logger.getLogger(PadecimientoDAO.class.getName());
      
    private MongoCollection<Padecimiento> coleccionPadecimiento;
    
    public PadecimientoDAO(){
        this.coleccionPadecimiento = ConexionMongoDB.obtenerBaseDatos().getCollection("padecimiento", Padecimiento.class);
    }
    @Override
    public List<Padecimiento> consultarPadecimiento(Long idPadecimiento) throws PersistenciaException {
        try{
            return coleccionPadecimiento.find().into(new ArrayList<>());
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al consultar los padecimientos: "+ex.getMessage());
        }
    }
}
