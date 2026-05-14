/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia.entidades;

import java.util.List;

/**
 *
 * @author BALAMRUSH
 */
public class DiaSemanaDieta {
    private String idDSD;
    private String nombreDiaSemanaDieta;
    private List <TiempoComidaDieta> tiemposComida;

    public DiaSemanaDieta() {
    }

    public String getIdDSD() {
        return idDSD;
    }

    public void setIdDSD(String idDSD) {
        this.idDSD = idDSD;
    }

    public String getNombreDiaSemanaDieta() {
        return nombreDiaSemanaDieta;
    }

    public void setNombreDiaSemanaDieta(String nombreDiaSemanaDieta) {
        this.nombreDiaSemanaDieta = nombreDiaSemanaDieta;
    }

    public List<TiempoComidaDieta> getTiemposComida() {
        return tiemposComida;
    }

    public void setTiemposComida(List<TiempoComidaDieta> tiemposComida) {
        this.tiemposComida = tiemposComida;
    }
    
    
}
