/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

/**
 *
 * @author BALAMRUSH
 */
public interface IPersistenciaDAO {
    public abstract IPacienteDAO getPacienteDAO();
    public abstract IAlergiaDAO getAlergiaDAO();
    public abstract IAlimentoDAO getAlimentosDAO();
    public abstract IClientesDAO getClientesDAO();
    public abstract IDatosBiologicosDAO getDatosBiologicosDAO();
    public abstract IDietaDAO getDietasDAO();
    public abstract IEstiloVidaDAO getEstiloVidaDAO();
    public abstract IPadecimientoDAO getPadecimientoDAO();
    public abstract IRegistroDietaDAO getRegistroDietaDAO();
}
