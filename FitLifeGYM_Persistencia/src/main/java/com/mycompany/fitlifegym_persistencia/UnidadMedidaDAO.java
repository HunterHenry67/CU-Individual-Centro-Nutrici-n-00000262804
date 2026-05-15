/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mongodb.client.MongoCollection;
import com.mycompany.fitlifegym_persistencia.entidades.Alergia;
import com.mycompany.fitlifegym_persistencia.entidades.UnidadMedida;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class UnidadMedidaDAO implements IUnidadMedidaDAO{

    private static final Logger LOGGER = Logger.getLogger(UnidadMedidaDAO.class.getName());
    
    private MongoCollection coleccionUnidadMedida;
    
    private UnidadMedidaDAO(){
        this.coleccionUnidadMedida = ConexionMongoDB.obtenerBaseDatos().getCollection("unidadMedida", UnidadMedida.class);
    }

    @Override
    public List<UnidadMedida> consultarUnidadMedida(Long idUnidadMedida) throws PersistenciaException {
        try{
            return null;
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al consultar la unidad de medida: "+ex.getMessage());
        }
    }
    
}
