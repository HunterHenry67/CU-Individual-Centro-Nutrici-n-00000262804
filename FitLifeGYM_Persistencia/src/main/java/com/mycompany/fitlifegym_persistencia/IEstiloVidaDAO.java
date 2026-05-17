/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mycompany.fitlifegym_persistencia.entidades.EstiloVida;
import java.util.List;

/**
 *
 * @author BALAMRUSH
 */
public interface IEstiloVidaDAO {
    public abstract EstiloVida seleccionarEstiloVida(EstiloVida estiloVida) throws PersistenciaException;

    public abstract List<EstiloVida> consultarEstiloVida(String idEstiloVida) throws PersistenciaException;

}
