/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia.entidades;

import org.bson.codecs.pojo.annotations.BsonProperty;

/**
 *
 * @author BALAMRUSH
 */
public class Alergia {
    
    @BsonProperty("_id")
    private String idAlergia;
    private String nombreAlergia;

    public Alergia() {
    }

    public Alergia(String idAlergia, String nombreAlergia) {
        this.idAlergia = idAlergia;
        this.nombreAlergia = nombreAlergia;
    }

    public Alergia(String nombreAlergia) {
        this.nombreAlergia = nombreAlergia;
    }

    public String getIdAlergia() {
        return idAlergia;
    }

    public void setIdAlergia(String idAlergia) {
        this.idAlergia = idAlergia;
    }

    public String getNombreAlergia() {
        return nombreAlergia;
    }

    public void setNombreAlergia(String nombreAlergia) {
        this.nombreAlergia = nombreAlergia;
    }
    
    
}
