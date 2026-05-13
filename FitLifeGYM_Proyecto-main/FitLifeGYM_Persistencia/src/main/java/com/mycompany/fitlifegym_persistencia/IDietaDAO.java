/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mycompany.fitlifegym_persistencia.entidades.Dieta;
import java.util.List;

/**
 *
 * @author BALAMRUSH
 */
public interface IDietaDAO {
    public abstract Dieta agregarRegistroDieta(Dieta dieta) throws PersistenciaException;

    public abstract Dieta registrarDieta(Dieta dieta) throws PersistenciaException;

    public abstract List<Dieta> busquedaDietaPacienteFiltro(Long idDieta) throws PersistenciaException;

    public abstract List<Dieta> buscarDietaFiltro(Long idDieta) throws PersistenciaException;
}
