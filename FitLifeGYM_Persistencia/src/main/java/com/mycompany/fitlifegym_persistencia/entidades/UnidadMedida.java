/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia.entidades;

/**
 *
 * @author BALAMRUSH
 */
public class UnidadMedida {
    
    private String idUnidadMedida;
    private String nombreUnidadMedida;

    public UnidadMedida() {
    }

    public UnidadMedida(String idUnidadMedida, String nombreUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
        this.nombreUnidadMedida = nombreUnidadMedida;
    }

    public String getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(String idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    public String getNombreUnidadMedida() {
        return nombreUnidadMedida;
    }

    public void setNombreUnidadMedida(String nombreUnidadMedida) {
        this.nombreUnidadMedida = nombreUnidadMedida;
    }
    
    
}
