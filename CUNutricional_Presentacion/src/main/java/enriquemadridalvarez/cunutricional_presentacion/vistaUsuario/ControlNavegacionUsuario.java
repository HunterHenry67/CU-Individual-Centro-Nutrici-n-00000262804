/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enriquemadridalvarez.cunutricional_presentacion.vistaUsuario;

/**
 *
 * @author BALAMRUSH
 */
public class ControlNavegacionUsuario {
    
    private ControlUsuario controlUsuario;
    
    public ControlNavegacionUsuario(){
        this.controlUsuario = new ControlUsuario();
    }
    
    public void mostrarBusquedaAlregiasFrom(){
        BusquedaAlergiasFORM formBA = new BusquedaAlergiasFORM(controlUsuario);
        formBA.setVisible(true);
    }
    
    public void mostrarBusquedaDietaForm(){
        BusquedaDietasFORM formBD = new BusquedaDietasFORM(controlUsuario);
        formBD.setVisible(true);
    }
    
    public void mostrarBusquedaPadecimientoForm(){
        BusquedaPadeciminetosFORM formBP = new BusquedaPadeciminetosFORM(controlUsuario);
        formBP.setVisible(true);        
    }
    
    public void mostrarMenuCentroNutricionalForm(){
        MenuCentroNutricionalFORM formMCN = new MenuCentroNutricionalFORM(controlUsuario);
        formMCN.setVisible(true);
    }
    
    public void mostrarRegistroDatosBiometricos(){
        RegistroDatosBiometricosFORM formRDB = new RegistroDatosBiometricosFORM(controlUsuario);
        formRDB.setVisible(true);
    }
    
    public void mostrarRegistroEnfermedades(){
        RegistroEnfermedadesFORM formRE = new RegistroEnfermedadesFORM(controlUsuario);
        formRE.setVisible(true);
    }
}
