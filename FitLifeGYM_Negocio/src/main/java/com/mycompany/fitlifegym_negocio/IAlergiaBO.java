/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_negocio;

import com.mycompany.fitlifegym_persistencia.entidades.Alergia;
import java.util.List;

/**
 *
 * @author BALAMRUSH
 */
public interface IAlergiaBO {
    public abstract List<Alergia> consultarAlergia() throws NegocioException;
    public abstract Alergia consultarAlergiaPorID(String idAlergia) throws NegocioException;
}
