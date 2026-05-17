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
import com.mycompany.fitlifegym_persistencia.entidades.TipoMembresia;
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

    public PersistenciaDAO() {
    }
   
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
    public List<Alergia> consultarAlergia() throws PersistenciaException {
        return this.alergiaDAO.consultarAlergia();
    }

    @Override
    public Alergia consultarAlergiaPorID(String idAlergia) throws PersistenciaException {
        return this.alergiaDAO.consultarAlergiaPorID(idAlergia);
    }

    @Override
    public List<Alimento> consultarAlimento() throws PersistenciaException {
        return this.alimentoDAO.consultarAlimento();
    }

    @Override
    public Alimento buscarAlimentoPorNombre(String nombreAlimento) throws PersistenciaException {
       return this.alimentoDAO.buscarAlimentoPorNombre(nombreAlimento);
    }

    @Override
    public Alimento consultarAlimentoPorID(String idAlimento) throws PersistenciaException {
        return this.alimentoDAO.consultarAlimentoPorID(idAlimento);
    }

    @Override
    public void actualizarMembresia(Long idCliente, TipoMembresia nuevaMembresia) throws PersistenciaException {
        
    }

    @Override
    public Dieta registrarDieta(Dieta dieta) throws PersistenciaException {
        return this.dietasDAO.registrarDieta(dieta);
    }

    @Override
    public Dieta consultarDietaPaciente(String idPaciente) throws PersistenciaException {
        return this.dietasDAO.consultarDietaPaciente(idPaciente);
    }

    @Override
    public List<Dieta> consultarDietas() throws PersistenciaException {
        return this.dietasDAO.consultarDietas();
    }

    @Override
    public List<Dieta> buscarDietaFiltro(String tipoFiltro, String valor) throws PersistenciaException {
        return this.dietasDAO.buscarDietaFiltro(tipoFiltro, valor);
    }

    @Override
    public void eliminarDieta(String idDieta) throws PersistenciaException {
        this.dietasDAO.eliminarDieta(idDieta);
    }

    @Override
    public EstiloVida seleccionarEstiloVida(EstiloVida estiloVida) throws PersistenciaException {
        return this.estiloVidaDAO.seleccionarEstiloVida(estiloVida);
    }

    @Override
    public List<EstiloVida> consultarEstiloVida(String idEstiloVida) throws PersistenciaException {
        return this.estiloVidaDAO.consultarEstiloVida(idEstiloVida);
    }

    @Override
    public Paciente consultarPaciente(Long idPaciente) throws PersistenciaException {
        return this.pacienteDAO.consultarPaciente(idPaciente);
    }

    @Override
    public boolean eliminarPaciente(Long idPaciente) throws PersistenciaException {
        return this.pacienteDAO.eliminarPaciente(idPaciente);
    }

    @Override
    public List<Padecimiento> consultarPadecimiento(Long idPadecimiento) throws PersistenciaException {
        return this.padecimientoDAO.consultarPadecimiento(idPadecimiento);
    }

    @Override
    public List<UnidadMedida> consultarUnidadMedida() throws PersistenciaException {
        return this.unidadMedidaDAO.consultarUnidadMedida();
    }

    @Override
    public UnidadMedida consultarUniMedidaPorID(String idUnidadMedida) throws PersistenciaException {
        return this.unidadMedidaDAO.consultarUniMedidaPorID(idUnidadMedida);
    }

    

   
    
}
