/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_negocio;

import com.mycompany.fitlifegym_dtos.DietaDTO;
import com.mycompany.fitlifegym_persistencia.DietasDAO;
import com.mycompany.fitlifegym_persistencia.IDietaDAO;

/**
 *
 * @author BALAMRUSH
 */
public class DietaBO implements IDietasBO{
    
    private final IDietaDAO dietaDAO;
    
    public DietaBO(){
        this.dietaDAO = new DietasDAO();
    }

    @Override
    public void validarDieta(DietaDTO dieta) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DietaDTO consultarDietaPorID(String id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
