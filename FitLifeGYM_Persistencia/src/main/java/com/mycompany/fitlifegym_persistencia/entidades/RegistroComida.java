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
    private Alimento alimento;
    private UnidadMedida unidadMedida;
    private Double cantidad;

    public RegistroComida() {
    }       

    public RegistroComida(String idRC, Alimento alimento, UnidadMedida unidadMedida, Double cantidad) {
        this.idRC = idRC;
        this.alimento = alimento;
        this.unidadMedida = unidadMedida;
        this.cantidad = cantidad;
    }

    public String getIdRC() {
        return idRC;
    }

    public void setIdRC(String idRC) {
        this.idRC = idRC;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
