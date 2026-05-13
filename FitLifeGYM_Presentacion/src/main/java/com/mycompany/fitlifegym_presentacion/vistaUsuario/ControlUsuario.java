/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion.vistaUsuario;


import com.mycompany.fitlifegym_dtos.AlergiaDTO;
import com.mycompany.fitlifegym_dtos.EstiloVidaDTO;
import com.mycompany.fitlifegym_dtos.PadecimientoDTO;
import com.mycompany.fitlifegym_negocio.NegocioException;
import enriquemadridalvarez.cucentronutricional.ICUCentroNutricional;

/**
 *
 * @author BALAMRUSH
 */
public class ControlUsuario {
    
    private static ControlUsuario controlUsuarioInstancia;
    
    private ICUCentroNutricional fachadaCentroNutricional;
    
    private ControlUsuario(){      
    }
    
    public static synchronized ControlUsuario getInstance(){
        if(controlUsuarioInstancia == null){
            controlUsuarioInstancia = new ControlUsuario();
        }
        return controlUsuarioInstancia;
    }
    
    
    
    
}
