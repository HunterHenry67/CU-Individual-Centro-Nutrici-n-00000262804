/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enriquemadridalvarez.cunutricional_entidades;

/**
 *
 * @author BALAMRUSH
 */
public class EstiloVida {
    
    private String idEstiloVida;
    private String nombreEstiloVida;
    private String descripcion;

    public EstiloVida() {
    }
    
    public EstiloVida(String idEstiloVida, String nombreEstiloVida, String descripcion) {
        this.idEstiloVida = idEstiloVida;
        this.nombreEstiloVida = nombreEstiloVida;
        this.descripcion = descripcion;
    }

    public EstiloVida(String nombreEstiloVida, String descripcion) {
        this.nombreEstiloVida = nombreEstiloVida;
        this.descripcion = descripcion;
    }

    public String getIdEstiloVida() {
        return idEstiloVida;
    }

    public void setIdEstiloVida(String idEstiloVida) {
        this.idEstiloVida = idEstiloVida;
    }

    public String getNombreEstiloVida() {
        return nombreEstiloVida;
    }

    public void setNombreEstiloVida(String nombreEstiloVida) {
        this.nombreEstiloVida = nombreEstiloVida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
