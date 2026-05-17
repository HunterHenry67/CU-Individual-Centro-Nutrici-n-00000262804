/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mycompany.fitlifegym_persistencia.entidades.UnidadMedida;
import java.util.List;

/**
 *
 * @author BALAMRUSH
 */
public interface IUnidadMedidaDAO {

    public abstract List<UnidadMedida> consultarUnidadMedida() throws PersistenciaException;
    
    public abstract UnidadMedida consultarUniMedidaPorID(String idUnidadMedida) throws PersistenciaException;
}
