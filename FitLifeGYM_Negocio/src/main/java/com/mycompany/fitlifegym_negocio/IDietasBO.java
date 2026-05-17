/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_negocio;

import com.mycompany.fitlifegym_dtos.DietaDTO;
import com.mycompany.fitlifegym_persistencia.entidades.Dieta;
import java.util.List;


/**
 *
 * @author BALAMRUSH
 */
public interface IDietasBO {  
    public abstract Dieta registrarDieta(Dieta dieta) throws NegocioException;
    public abstract Dieta consultarDietaPaciente(String idPaciente) throws NegocioException;
    public abstract List<Dieta> consultarDietas() throws NegocioException;
    public abstract void eliminarDieta(String idDieta) throws NegocioException;
    public abstract List<Dieta> buscarDietaFiltro(String tipoFiltro, String valor) throws NegocioException;
    
}
