/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mycompany.fitlifegym_persistencia.entidades.Alergia;
import java.util.List;

/**
 *
 * @author BALAMRUSH
 */
public interface IAlergiaDAO {
    public abstract Alergia agregarAlergia(Alergia alergia) throws PersistenciaException;

    public abstract List<Alergia> consultarAlergia() throws PersistenciaException;

    public abstract boolean eliminarAlergia(Long idAlergia) throws PersistenciaException;
}
