/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_persistencia;

import com.mycompany.fitlifegym_persistencia.entidades.Alergia;
import com.mycompany.fitlifegym_persistencia.entidades.Alimento;
import com.mycompany.fitlifegym_persistencia.entidades.DatosBiologicos;
import com.mycompany.fitlifegym_persistencia.entidades.Dieta;
import com.mycompany.fitlifegym_persistencia.entidades.EstiloVida;
import com.mycompany.fitlifegym_persistencia.entidades.Paciente;
import com.mycompany.fitlifegym_persistencia.entidades.Padecimiento;
import com.mycompany.fitlifegym_persistencia.entidades.UnidadMedida;
import java.util.List;

/**
 *
 * @author BALAMRUSH
 */
public interface IPersistenciaDAO {

    public abstract Paciente consultarPaciente(Long idPaciente) throws PersistenciaException;

    public abstract List<DatosBiologicos> consultarDatosBiologicos(Long idPaciente) throws PersistenciaException;

    public abstract boolean eliminarPaciente(Long idPaciente) throws PersistenciaException;

    public abstract DatosBiologicos registrarDatosBiologicos(DatosBiologicos datosBiologicos) throws PersistenciaException;

    public abstract Alergia agregarAlergia(Alergia alergia) throws PersistenciaException;

    public abstract List<Alergia> consultarAlergia() throws PersistenciaException;

    public abstract boolean eliminarAlergia(Long idAlergia) throws PersistenciaException;

    public abstract Padecimiento agregarPadecimiento(Padecimiento padecimiento) throws PersistenciaException;

    public abstract List<Padecimiento> consultarPadecimiento(Long idPadecimiento) throws PersistenciaException;

    public abstract boolean eliminarPadecimiento(Long idPadecimiento) throws PersistenciaException;

    public abstract EstiloVida seleccionarEstiloVida(EstiloVida estiloVida) throws PersistenciaException;

    public abstract List<EstiloVida> consultarEstiloVida(Long idEstiloVida) throws PersistenciaException;

    public abstract Alimento agregarAlimento(Alimento alimento) throws PersistenciaException;

    public abstract List<Alimento> consultarAlimento(Long idAlimento) throws PersistenciaException;

    public abstract UnidadMedida agregarUnidadMedida(UnidadMedida unidadMedida) throws PersistenciaException;

    public abstract List<UnidadMedida> consultarUnidadMedida(Long idUnidadMedida) throws PersistenciaException;

    public abstract Dieta agregarRegistroDieta(Dieta dieta) throws PersistenciaException;

    public abstract Dieta registrarDieta(Dieta dieta) throws PersistenciaException;

    public abstract List<Dieta> busquedaDietaPacienteFiltro(Long idDieta) throws PersistenciaException;

    public abstract List<Dieta> buscarDietaFiltro(Long idDieta) throws PersistenciaException;

}
