/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author BALAMRUSH
 */
public class ConexionMongoDB {
    
    private static MongoClient clienteMongo;
    private static MongoDatabase baseDatos;
    
    private static final String URI = "mongodb://localhost:27017";
    private static final String DATABSE = "FitLiefGym";
    
    public static MongoDatabase obtenerBaseDatos(){
        if(baseDatos == null){
            CodecRegistry codecRegistryPojo = CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build());
            CodecRegistry codecRegistry = CodecRegistries.fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), codecRegistryPojo);
            MongoClientSettings configuracion = MongoClientSettings.builder().applyConnectionString(new ConnectionString(URI)).codecRegistry(codecRegistry).build();
            clienteMongo = MongoClients.create(configuracion);
            baseDatos = clienteMongo.getDatabase(DATABSE);
        }
        return baseDatos;
    }
}
