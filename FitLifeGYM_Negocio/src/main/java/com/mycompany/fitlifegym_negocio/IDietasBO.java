/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_negocio;

import com.mycompany.fitlifegym_dtos.DietaDTO;


/**
 *
 * @author BALAMRUSH
 */
public interface IDietasBO {  
    public abstract void validarDieta(DietaDTO dieta) throws NegocioException;
    
    public abstract DietaDTO consultarDietaPorID(String id) throws NegocioException;
    
}
