/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mycompany.fitlifegym_persistencia.entidades.Alergia;
import com.mycompany.fitlifegym_persistencia.entidades.Alimento;
import com.mycompany.fitlifegym_persistencia.entidades.Dieta;
import com.mycompany.fitlifegym_persistencia.entidades.EstiloVida;
import com.mycompany.fitlifegym_persistencia.entidades.Paciente;
import com.mycompany.fitlifegym_persistencia.entidades.Padecimiento;
import com.mycompany.fitlifegym_persistencia.entidades.TipoMembresia;
import com.mycompany.fitlifegym_persistencia.entidades.UnidadMedida;
import java.util.List;

/**
 *
 * @author BALAMRUSH
 */
public interface IPersistenciaDAO {

    public abstract List<Alergia> consultarAlergia() throws PersistenciaException;
    public abstract Alergia consultarAlergiaPorID(String idAlergia) throws PersistenciaException;
    public abstract List<Alimento> consultarAlimento() throws PersistenciaException;
    
    public abstract Alimento buscarAlimentoPorNombre(String nombreAlimento) throws PersistenciaException;
    
    public abstract  Alimento consultarAlimentoPorID(String idAlimento) throws PersistenciaException;
    
    public abstract void actualizarMembresia(Long idCliente, TipoMembresia nuevaMembresia)throws PersistenciaException;
    public abstract Dieta registrarDieta(Dieta dieta) throws PersistenciaException;

    public abstract Dieta consultarDietaPaciente(String idPaciente) throws PersistenciaException;

    public abstract List<Dieta> consultarDietas() throws PersistenciaException;

    public abstract List<Dieta> buscarDietaFiltro(String tipoFiltro, String valor) throws PersistenciaException;
    
    public abstract void eliminarDieta(String idDieta) throws PersistenciaException;
    public abstract EstiloVida seleccionarEstiloVida(EstiloVida estiloVida) throws PersistenciaException;

    public abstract List<EstiloVida> consultarEstiloVida(String idEstiloVida) throws PersistenciaException;
    public abstract Paciente consultarPaciente(Long idPaciente) throws PersistenciaException;
    
    public abstract boolean eliminarPaciente(Long idPaciente) throws PersistenciaException;
    public abstract List<Padecimiento> consultarPadecimiento(Long idPadecimiento) throws PersistenciaException;
    public abstract List<UnidadMedida> consultarUnidadMedida() throws PersistenciaException;
    
    public abstract UnidadMedida consultarUniMedidaPorID(String idUnidadMedida) throws PersistenciaException;
}
