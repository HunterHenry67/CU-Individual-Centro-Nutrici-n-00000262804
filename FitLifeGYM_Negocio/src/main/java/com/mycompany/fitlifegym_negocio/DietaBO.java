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
public class DietaBO implements IDietasBO {

    private static final Logger LOGGER = Logger.getLogger(DietaBO.class.getName());

    private final IDietaDAO dietaDAO;

    public DietaBO() {
        this.dietaDAO = new DietasDAO();
    }

    @Override
    public void validarDieta(DietaDTO dieta) throws NegocioException {
        if (dieta == null) {
            throw new NegocioException("La dieta no puede estar vacía");
        }
        if (dieta.idPaciente() == null || dieta.idPaciente().trim().isEmpty()) {
            throw new NegocioException("Id del cliente faltante");
        }
        if (dieta.diaSemana() == null) {
            throw new NegocioException("Favor de elegir un día de la semana.");
        }
        if (dieta.fechaInicio() == null) {
            throw new NegocioException("Favor de colocar una fecha de inicio.");
        }
        if (dieta.fechaFinal() == null) {
            throw new NegocioException("Favor de colocar una fecha final.");
        }
        if (dieta.nombreNutriologo() == null || dieta.nombreNutriologo().trim().isEmpty()) {
            throw new NegocioException("Favor de colocar un Nutriologo.");
        }
        if (dieta.nombreDieta() == null || dieta.nombreDieta().trim().isEmpty()) {
            throw new NegocioException("Favor de colocar un nombre de Dieta.");
        }

    }

    @Override
    public DietaDTO consultarDietaPorID(String id) throws NegocioException {
        try{
            if(id == null){
                throw new NegocioException("El ID se encuentra vacío.");                    
            }
            
            Dieta
        }catch(NegocioException ex){
            
        }
    }

}
