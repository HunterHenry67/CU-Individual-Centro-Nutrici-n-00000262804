/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia.entidades;

import java.util.Date;
import org.bson.codecs.pojo.annotations.BsonProperty;

/**
 *
 * @author BALAMRUSH
 */
public class Dieta {
    
    @BsonProperty("_id")
    private String idDieta;
    private String nombreDieta;
    private String descrpcion;
    private Date fechaInicio;
    private Date fechaFinal;

    public Dieta() {
    }

    public Dieta(String idDieta, String nombreDieta, String descrpcion, Date fechaInicio, Date fechaFinal) {
        this.idDieta = idDieta;
        this.nombreDieta = nombreDieta;
        this.descrpcion = descrpcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public Dieta(String nombreDieta, String descrpcion, Date fechaInicio, Date fechaFinal) {
        this.nombreDieta = nombreDieta;
        this.descrpcion = descrpcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public String getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(String idDieta) {
        this.idDieta = idDieta;
    }

    public String getNombreDieta() {
        return nombreDieta;
    }

    public void setNombreDieta(String nombreDieta) {
        this.nombreDieta = nombreDieta;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    
    
}
