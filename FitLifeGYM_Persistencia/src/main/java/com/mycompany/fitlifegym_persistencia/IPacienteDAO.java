/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mycompany.fitlifegym_persistencia.entidades.Paciente;

/**
 *
 * @author BALAMRUSH
 */
public interface IPacienteDAO {
    public abstract Paciente consultarPaciente(Long idPaciente) throws PersistenciaException;
    
    public abstract boolean eliminarPaciente(Long idPaciente) throws PersistenciaException;
}
