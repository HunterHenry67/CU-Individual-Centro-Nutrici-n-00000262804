/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mycompany.fitlifegym_persistencia.entidades.DatosBiologicos;
import java.util.List;

/**
 *
 * @author BALAMRUSH
 */
public interface IDatosBiologicosDAO {
    public abstract DatosBiologicos registrarDatosBiologicos(DatosBiologicos datosBiologicos) throws PersistenciaException;
    
    public abstract List<DatosBiologicos> consultarDatosBiologicos(Long idPaciente) throws PersistenciaException;
}
