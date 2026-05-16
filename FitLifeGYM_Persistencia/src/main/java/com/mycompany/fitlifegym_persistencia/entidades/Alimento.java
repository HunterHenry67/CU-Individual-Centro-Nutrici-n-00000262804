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
public class Alimento {
    
    @BsonProperty("_id")
    private String idAlimento;
    private String nombreAlimento; 
    private Float cantidad;
    private byte[] imagen;

    public Alimento() {
    }

    public Alimento(String idAlimento, String nombreAlimento, Float cantidad, byte[] imagen) {
        this.idAlimento = idAlimento;
        this.nombreAlimento = nombreAlimento;
        this.cantidad = cantidad;
        this.imagen = imagen;
    }

    public Alimento(String nombreAlimento, Float cantidad, byte[] imagen) {
        this.nombreAlimento = nombreAlimento;
        this.cantidad = cantidad;
        this.imagen = imagen;
    }

    public String getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(String idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setNombreAlimento(String nombreAlimento) {
        this.nombreAlimento = nombreAlimento;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
