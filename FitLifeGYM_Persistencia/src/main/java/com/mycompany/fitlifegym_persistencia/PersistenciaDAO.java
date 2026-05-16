/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class PersistenciaDAO implements IPersistenciaDAO{
    private IAlergiaDAO alergiaDAO;
    private IAlimentoDAO alimentoDAO;
    private IDietaDAO dietasDAO;
    private IEstiloVidaDAO estiloVidaDAO;
    private IPacienteDAO pacienteDAO;
    private IPadecimientoDAO padecimientoDAO;
    private IUnidadMedidaDAO unidadMedidaDAO;

    public PersistenciaDAO(IAlergiaDAO alergiaDAO, IAlimentoDAO alimentoDAO, IDietaDAO dietasDAO, IEstiloVidaDAO estiloVidaDAO, IPacienteDAO pacienteDAO, IPadecimientoDAO padecimientoDAO, IUnidadMedidaDAO unidadMedidaDAO) {
        this.alergiaDAO = alergiaDAO;
        this.alimentoDAO = alimentoDAO;
        this.dietasDAO = dietasDAO;
        this.estiloVidaDAO = estiloVidaDAO;
        this.pacienteDAO = pacienteDAO;
        this.padecimientoDAO = padecimientoDAO;
        this.unidadMedidaDAO = unidadMedidaDAO;
    }

    @Override
    public Paciente consultarPaciente(Long idPaciente) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DatosBiologicos> consultarDatosBiologicos(Long idPaciente) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarPaciente(Long idPaciente) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DatosBiologicos registrarDatosBiologicos(DatosBiologicos datosBiologicos) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Alergia agregarAlergia(Alergia alergia) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Alergia> consultarAlergia() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarAlergia(Long idAlergia) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Padecimiento agregarPadecimiento(Padecimiento padecimiento) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Padecimiento> consultarPadecimiento(Long idPadecimiento) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarPadecimiento(Long idPadecimiento) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EstiloVida seleccionarEstiloVida(EstiloVida estiloVida) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<EstiloVida> consultarEstiloVida(Long idEstiloVida) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Alimento agregarAlimento(Alimento alimento) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Alimento> consultarAlimento(Long idAlimento) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UnidadMedida agregarUnidadMedida(UnidadMedida unidadMedida) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<UnidadMedida> consultarUnidadMedida(Long idUnidadMedida) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Dieta agregarRegistroDieta(Dieta dieta) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Dieta registrarDieta(Dieta dieta) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Dieta> busquedaDietaPacienteFiltro(Long idDieta) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Dieta> buscarDietaFiltro(Long idDieta) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
