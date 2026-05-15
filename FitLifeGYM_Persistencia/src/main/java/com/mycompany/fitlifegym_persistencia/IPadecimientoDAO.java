/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mycompany.fitlifegym_persistencia.entidades.Padecimiento;
import java.util.List;

/**
 *
 * @author BALAMRUSH
 */
public interface IPadecimientoDAO {
    public abstract List<Padecimiento> consultarPadecimiento(Long idPadecimiento) throws PersistenciaException;
}
