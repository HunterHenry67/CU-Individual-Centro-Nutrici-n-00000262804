/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia.entidades;
/**
 *
 * @author BALAMRUSH
 */
public class DatosBiologicos {
    private Float peso;
    private Float altura;
    private Integer edad;

    public DatosBiologicos() {
    }

    public DatosBiologicos( Float peso, Float altura, Integer edad) {     
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
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
    
}
