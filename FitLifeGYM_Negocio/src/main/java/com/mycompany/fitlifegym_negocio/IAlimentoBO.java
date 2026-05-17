/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_negocio;

import com.mycompany.fitlifegym_persistencia.PersistenciaException;
import com.mycompany.fitlifegym_persistencia.entidades.Alimento;
import java.util.List;

/**
 *
 * @author BALAMRUSH
 */
public interface IAlimentoBO {
    public abstract List<Alimento> consultarAlimento() throws NegocioException;
    
    public abstract Alimento buscarAlimentoPorNombre(String nombreAlimento) throws NegocioException;
    
    public abstract  Alimento consultarAlimentoPorID(String idAlimento) throws NegocioException;
}
