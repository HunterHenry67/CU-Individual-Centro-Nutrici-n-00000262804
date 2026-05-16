/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_negocio;

import com.mycompany.fitlifegym_dtos.DietaDTO;
import com.mycompany.fitlifegym_persistencia.DietasDAO;
import com.mycompany.fitlifegym_persistencia.IDietaDAO;
import java.util.logging.Logger;

/**
 *
 * @author BALAMRUSH
 */
public class DietaBO implements IDietasBO{

    private static final Logger LOGGER = Logger.getLogger(DietaBO.class.getName());
    
    private final IDietaDAO dietaDAO;
    
    public DietaBO(){
        this.dietaDAO = new DietasDAO();
    }

    @Override
    public void validarDieta(DietaDTO dieta) throws NegocioException {
        try{
            if(dieta == null){
                throw new IllegalArgumentException("La dieta no puede estar vacía");            
            }
            if(dieta.idPaciente() == null || dieta.idPaciente().trim().isEmpty()){
                throw new IllegalArgumentException("Id del cliente faltante");
            }
        }catch(Exception ex){
            throw new NegocioException();
        }
    }

    @Override
    public DietaDTO consultarDietaPorID(String id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
