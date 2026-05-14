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
public interface ICatalogoAlimentoDAO {
    public abstract List<Alimento> consultarAlimentos() throws PersistenciaException;
    public abstract List<Alimento> buscarAlimentoPorNombre(String nombre) throws PersistenciaException;              
}
