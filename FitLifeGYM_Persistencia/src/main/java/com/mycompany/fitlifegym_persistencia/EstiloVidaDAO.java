/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.fitlifegym_persistencia.entidades.EstiloVida;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class EstiloVidaDAO implements IEstiloVidaDAO{

    private static final Logger LOGGER = Logger.getLogger(EstiloVidaDAO.class.getName());
    
    private MongoCollection<EstiloVida> coleccionEstiloVida;
    
    public EstiloVidaDAO(){
        this.coleccionEstiloVida = ConexionMongoDB.obtenerBaseDatos().getCollection("estiloVida", EstiloVida.class);
    }

    @Override
    public EstiloVida seleccionarEstiloVida(EstiloVida estiloVida) throws PersistenciaException {
        try{
            return coleccionEstiloVida.find(Filters.eq("_id", estiloVida.getIdEstiloVida())).first();
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al querer seleccionar un Estilo de Vida: "+ex.getMessage());
        }
    }

    @Override
    public List<EstiloVida> consultarEstiloVida(Long idEstiloVida) throws PersistenciaException {
        try{
            return coleccionEstiloVida.find().into(new ArrayList<>());
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al consultar los estilos de vida: "+ex.getMessage());                    
        }
    }
    
}
