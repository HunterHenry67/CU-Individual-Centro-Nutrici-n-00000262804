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
    public abstract UnidadMedida agregarUnidadMedida(UnidadMedida unidadMedida) throws PersistenciaException;

    public abstract List<UnidadMedida> consultarUnidadMedida(Long idUnidadMedida) throws PersistenciaException;
}
