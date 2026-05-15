/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia.entidades;

import java.util.Date;
import java.util.List;
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
    private String idPaciente;
    private String nombreNutriologo;
    private List<DiaSemanaDieta> diasSemana;
    

    public Dieta() {
    }

    public Dieta(String idDieta, String nombreDieta, String descrpcion, Date fechaInicio, Date fechaFinal, String idPaciente, String nombreNutriologo, List<DiaSemanaDieta> diasSemana) {
        this.idDieta = idDieta;
        this.nombreDieta = nombreDieta;
        this.descrpcion = descrpcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.idPaciente = idPaciente;
        this.nombreNutriologo = nombreNutriologo;
        this.diasSemana = diasSemana;
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

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombreNutriologo() {
        return nombreNutriologo;
    }

    public void setNombreNutriologo(String nombreNutriologo) {
        this.nombreNutriologo = nombreNutriologo;
    }

    public List<DiaSemanaDieta> getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(List<DiaSemanaDieta> diasSemana) {
        this.diasSemana = diasSemana;
    }

    
    
    
}
