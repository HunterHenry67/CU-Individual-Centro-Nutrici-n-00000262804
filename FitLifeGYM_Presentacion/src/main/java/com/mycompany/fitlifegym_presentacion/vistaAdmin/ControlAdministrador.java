/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion.vistaAdmin;

import enriquemadridalvarez.cucentronutricional.ICUCentroNutricional;

/**
 *
 * @author BALAMRUSH
 */
public class ControlAdministrador {
    
    private static ControlAdministrador controlAdminInstancia;
    
    private ICUCentroNutricional fachadaCentroNutricional;
    
    private ControlAdministrador(){
        
    }
    
    public static synchronized ControlAdministrador getInstance(){
        if(controlAdminInstancia == null){
            controlAdminInstancia = new ControlAdministrador();
        }
        return controlAdminInstancia;
    }
        
    
    
        

}
