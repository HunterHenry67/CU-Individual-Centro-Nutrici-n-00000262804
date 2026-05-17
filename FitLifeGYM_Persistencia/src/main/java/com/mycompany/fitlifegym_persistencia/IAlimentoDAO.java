/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mycompany.fitlifegym_persistencia.entidades.Alimento;
import java.util.List;

/**
 *
 * @author BALAMRUSH
 */
public interface IAlimentoDAO {
  
    public abstract List<Alimento> consultarAlimento() throws PersistenciaException;
    
    public abstract Alimento buscarAlimentoPorNombre(String nombreAlimento) throws PersistenciaException;
    
    public abstract  Alimento consultarAlimentoPorID(String idAlimento) throws PersistenciaException;
}
