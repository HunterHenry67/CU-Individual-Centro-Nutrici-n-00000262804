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
public class TiempoComidaDieta {
    private String idTCD;
    private String nombreTiempoComidaDIeta;
    private List <RegistroComida> registrosComida;

    public TiempoComidaDieta() {
    }

    public String getIdTCD() {
        return idTCD;
    }

    public void setIdTCD(String idTCD) {
        this.idTCD = idTCD;
    }

    public String getNombreTiempoComidaDIeta() {
        return nombreTiempoComidaDIeta;
    }

    public void setNombreTiempoComidaDIeta(String nombreTiempoComidaDIeta) {
        this.nombreTiempoComidaDIeta = nombreTiempoComidaDIeta;
    }

    public List<RegistroComida> getRegistrosComida() {
        return registrosComida;
    }

    public void setRegistrosComida(List<RegistroComida> registrosComida) {
        this.registrosComida = registrosComida;
    }
    
    
}
