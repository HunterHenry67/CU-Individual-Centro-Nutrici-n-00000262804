/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion.vistaAdmin;

import com.mycompany.fitlifegym_presentacion.vistaAdmin.ControlAdministrador;
import com.mycompany.fitlifegym_presentacion.vistaAdmin.BusquedaNuevosPacientesFORM;
import com.mycompany.fitlifegym_presentacion.vistaAdmin.BusquedaDietasPacienteFORM;
import com.mycompany.fitlifegym_presentacion.vistaAdmin.BuscarAlimentoFORM;
import com.mycompany.fitlifegym_presentacion.vistaAdmin.AsignacionDietaFORM;
import com.mycompany.fitlifegym_presentacion.vistaAdmin.AlimentosSeleccionadosFORM;

/**
 *
 * @author BALAMRUSH
 */
public class ControlNavegacionAdmin {
    
    private ControlAdministrador controlAdministrador;
    
    public ControlNavegacionAdmin(){
        this.controlAdministrador = ControlAdministrador.getInstance();
    }
    
    public void mostrarAlimentosSeleccionadosForm(){
        AlimentosSeleccionadosFORM formAS = new AlimentosSeleccionadosFORM(controlAdministrador);
        formAS.setVisible(true);
    }
    
    public void mostrarAsignacionDietaForm(){
        AsignacionDietaFORM formAD = new AsignacionDietaFORM(controlAdministrador);
        formAD.setVisible(true);
    }
    
    public void mostrarBuscarAlimentoForm(){
        BuscarAlimentoFORM formBA = new BuscarAlimentoFORM(controlAdministrador);
        formBA.setVisible(true);
    }
    
    public void mostrarBusquedaDietasPacienteForm(){
        BusquedaDietasPacienteFORM formBDP = new BusquedaDietasPacienteFORM(controlAdministrador);
        formBDP.setVisible(true);
    }
    
    public void mostrarBusquedaNuevosPacientesfForm(){
        BusquedaNuevosPacientesFORM formBNP = new BusquedaNuevosPacientesFORM(controlAdministrador);
        formBNP.setVisible(true);
    }
    
    public void mostrarMenuCentroNutricionForm(){
        MenuCentroNutricionFORM formMCN = new MenuCentroNutricionFORM(controlAdministrador);
        formMCN.setVisible(true);
    }
    
    public void mostrarRegistroDietaForm(){
        RegistroDietaFORM formRD = new RegistroDietaFORM(controlAdministrador);
        formRD.setVisible(true);
    }
}
