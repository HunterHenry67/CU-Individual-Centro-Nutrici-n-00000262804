/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.fitlifegym_persistencia.entidades.Dieta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.bson.conversions.Bson;

/**
 *
 * @author Home
 */
public class DietasDAO implements IDietaDAO{

    private static final Logger LOGGER = Logger.getLogger(DietasDAO.class.getName());
    
    private MongoCollection<Dieta> collectionDietas;

    public DietasDAO() {
        this.collectionDietas = ConexionMongoDB.obtenerBaseDatos().getCollection("dietas", Dieta.class);
    }

    @Override
    public Dieta registrarDieta(Dieta dieta) throws PersistenciaException {
       try{
           collectionDietas.insertOne(dieta);
           return dieta;
       }catch(Exception ex){
           LOGGER.severe(ex.getMessage());
           throw new PersistenciaException("Error al registrar la dieta: " + ex.getMessage());
       }
    }

    @Override
    public Dieta consultarDietaPaciente(String idPaciente) throws PersistenciaException {
        try{
            return collectionDietas.find(Filters.eq("idPaciente", idPaciente)).first();
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al consultar la dieta del paciente: " +ex.getMessage());
        }
    }

    @Override
    public List<Dieta> consultarDietas(String idPaciente) throws PersistenciaException {
       try{
           return collectionDietas.find(Filters.eq("idPaciente", idPaciente)).into(new ArrayList<>());
       }catch(Exception ex){
           LOGGER.severe(ex.getMessage());
           throw new PersistenciaException("Error al consultar dietas: "+ ex.getMessage());
       }
           
    }

    @Override
    public List<Dieta> buscarDietaFiltro(String tipoFiltro, String valor) throws PersistenciaException {
        try{
            Bson filtros;
            switch(tipoFiltro){
                case "Nombre":
                    filtros = Filters.regex("nombrePaciente", valor, "i");
                    break;
                case "Dieta":
                    filtros = Filters.regex("nombreDieta", valor, "i");
                    break;
                case "Fecha Inicio":
                    LocalDate fechaIn = LocalDate.parse(valor);
                    filtros = Filters.eq("fechaInicio", fechaIn);
                    break;
                case "Fecha Final":
                    LocalDate fechaFi = LocalDate.parse(valor);
                    filtros = Filters.eq("fechaFinal", fechaFi);
                    break;
                case "Nutriologo":
                    filtros = Filters.regex("nombreNutriologo", valor, "i");
                    break;
                default:
                    return collectionDietas.find().into(new ArrayList<>());
            }
            return collectionDietas.find(filtros).into(new ArrayList<>());
            
        }catch(Exception ex){
            LOGGER.severe(ex.getMessage());
            throw new PersistenciaException("Error al buscar Dieta por Filtro: "+ex.getMessage());
        }
    }

    
    
}
