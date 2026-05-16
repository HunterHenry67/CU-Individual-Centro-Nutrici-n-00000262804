/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia.entidades;

/**
 *
 * @author BALAMRUSH
 */
public class RegistroComida {
    private String idRC;
    private String idAlimento;
    private String idUnidadMedida;
    private Double cantidad;

    public RegistroComida() {
    }       

    public RegistroComida(String idRC, String idAlimento, String idUnidadMedida, Double cantidad) {
        this.idRC = idRC;
        this.idAlimento = idAlimento;
        this.idUnidadMedida = idUnidadMedida;
        this.cantidad = cantidad;
    }

    public String getIdRC() {
        return idRC;
    }

    public void setIdRC(String idRC) {
        this.idRC = idRC;
    }

    public String getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(String idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(String idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

   
    
    
}
