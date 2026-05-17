/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_negocio;

import com.mycompany.fitlifegym_dtos.AlimentoDTO;
import java.util.List;

/**
 *
 * @author BALAMRUSH
 */
public interface IAlimentoBO {
    public abstract List<AlimentoDTO> consultarAlimento() throws NegocioException;
    
    public abstract AlimentoDTO buscarAlimentoPorNombre(String nombreAlimento) throws NegocioException;
    
    public abstract  AlimentoDTO consultarAlimentoPorID(String idAlimento) throws NegocioException;
}
