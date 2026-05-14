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
public class DatosBiologicos {
    
    @BsonProperty("_id")
    private String idDatosBiologicos;
    private Float peso;
    private Float altura;
    private Integer edad;
    private Date fechaRegistro;

    public DatosBiologicos() {
    }

    public DatosBiologicos(String idDatosBiologicos, Float peso, Float altura, Integer edad, Date fechaRegistro) {
        this.idDatosBiologicos = idDatosBiologicos;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.fechaRegistro = fechaRegistro;
    }

    public DatosBiologicos(Float peso, Float altura, Integer edad, Date fechaRegistro) {
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.fechaRegistro = fechaRegistro;
    }

    public String getIdDatosBiologicos() {
        return idDatosBiologicos;
    }

    public void setIdDatosBiologicos(String idDatosBiologicos) {
        this.idDatosBiologicos = idDatosBiologicos;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
}
