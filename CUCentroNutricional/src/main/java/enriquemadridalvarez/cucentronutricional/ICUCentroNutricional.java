/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package enriquemadridalvarez.cucentronutricional;

import com.mycompany.fitlifegym_dtos.PacienteDTO;
import com.mycompany.fitlifegym_negocio.NegocioException;
import java.util.List;

/**
 *
 * @author BALAMRUSH
 */
public interface ICUCentroNutricional {
    public abstract boolean validarPacienteExistente() throws NegocioException;
    public abstract boolean validarEstiloVida() throws NegocioException;
    public abstract boolean validarDatosBiologicos() throws NegocioException;
    public abstract boolean validarAlergia() throws NegocioException;
    public abstract boolean validarAlimento() throws NegocioException;
    public abstract boolean validarCantidad() throws NegocioException;
    public abstract boolean validarUnidadMedida() throws NegocioException;
    public abstract boolean validarPadecimiento() throws NegocioException;
    public abstract boolean validarDiaSemana() throws NegocioException;
    public abstract boolean validarRegistroDieta() throws NegocioException;
    public abstract List<PacienteDTO> consultarPaciente() throws NegocioException;
}
