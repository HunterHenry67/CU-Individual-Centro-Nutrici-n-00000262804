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
public class Padecimiento {
    
    @BsonProperty("_id")
    private String idPadecimiento;
    private String nombrePadecimiento;

    public Padecimiento() {
    }

    public Padecimiento(String idPadecimiento, String nombrePadecimiento) {
        this.idPadecimiento = idPadecimiento;
        this.nombrePadecimiento = nombrePadecimiento;
    }

    public Padecimiento(String nombrePadecimiento) {
        this.nombrePadecimiento = nombrePadecimiento;
    }

    public String getIdPadecimiento() {
        return idPadecimiento;
    }

    public void setIdPadecimiento(String idPadecimiento) {
        this.idPadecimiento = idPadecimiento;
    }

    public String getNombrePadecimiento() {
        return nombrePadecimiento;
    }

    public void setNombrePadecimiento(String nombrePadecimiento) {
        this.nombrePadecimiento = nombrePadecimiento;
    }
    
    
}
