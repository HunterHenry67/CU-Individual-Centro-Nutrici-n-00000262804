/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

import com.mycompany.fitlifegym_dtos.AlimentoDTO;
import com.mycompany.fitlifegym_dtos.DiaSemanaDTO;
import com.mycompany.fitlifegym_dtos.DietaDTO;
import com.mycompany.fitlifegym_dtos.EstadoDTO;
import com.mycompany.fitlifegym_dtos.ImagenDTO;
import com.mycompany.fitlifegym_dtos.NuevaMembresiaCompradaDTO;
import com.mycompany.fitlifegym_dtos.NuevaMembresiaDTO;
import com.mycompany.fitlifegym_dtos.NuevoClienteDTO;
import com.mycompany.fitlifegym_dtos.RegistroComidaDTO;
import com.mycompany.fitlifegym_dtos.TiempoComidaDietaDTO;
import com.mycompany.fitlifegym_dtos.TipoMembresiaDTO;
import com.mycompany.fitlifegym_dtos.UnidadMedidaDTO;
import com.mycompany.fitlifegym_persistencia.entidades.Alimento;
import com.mycompany.fitlifegym_persistencia.entidades.Cliente;
import com.mycompany.fitlifegym_persistencia.entidades.DiaSemanaDieta;
import com.mycompany.fitlifegym_persistencia.entidades.Dieta;
import com.mycompany.fitlifegym_persistencia.entidades.Estado;
import com.mycompany.fitlifegym_persistencia.entidades.Membresia;
import com.mycompany.fitlifegym_persistencia.entidades.MembresiaComprada;
import com.mycompany.fitlifegym_persistencia.entidades.RegistroComida;
import com.mycompany.fitlifegym_persistencia.entidades.TiempoComidaDieta;
import com.mycompany.fitlifegym_persistencia.entidades.TipoMembresia;
import com.mycompany.fitlifegym_persistencia.entidades.UnidadMedida;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class DtosAEntidadesAdapter {

    public static Membresia adaptarMembresia(NuevaMembresiaDTO nuevaMembresiaDTO) {
        TipoMembresia tipoMembresiaDominio = TipoMembresia.BRONCE;

        if (nuevaMembresiaDTO.getTipoMembresia() == TipoMembresiaDTO.PLATA) {
            tipoMembresiaDominio = TipoMembresia.PLATA;
        } else if (nuevaMembresiaDTO.getTipoMembresia() == TipoMembresiaDTO.ORO) {
            tipoMembresiaDominio = TipoMembresia.ORO;
        }

        Membresia membresia = new Membresia(tipoMembresiaDominio,
                nuevaMembresiaDTO.getPrecio(),
                nuevaMembresiaDTO.getVigencia());

        return membresia;
    }

    public static MembresiaComprada adaptarMembresiaCompradaDTO(NuevaMembresiaCompradaDTO membresiaCompradaDTO) {
        Membresia membresia = adaptarMembresia(membresiaCompradaDTO.getMembresia());
        Estado estadoDominio = Estado.ACTIVO;

        if (membresiaCompradaDTO.getEstado() == EstadoDTO.INACTIVO) {
            estadoDominio = Estado.INACTIVO;
        }

        MembresiaComprada membresiaComprada = new MembresiaComprada(membresia,
                membresiaCompradaDTO.getFechaInicio(),
                membresiaCompradaDTO.getFechaFin(),
                membresiaCompradaDTO.getPrecioPagado(),
                estadoDominio);

        return membresiaComprada;
    }

    public static Cliente adaptarClienteDTO(NuevoClienteDTO clienteDTO) {
        MembresiaComprada membresiaComprada = null;

        if (clienteDTO.getMembresíaComprada() != null) {
            membresiaComprada = adaptarMembresiaCompradaDTO(clienteDTO.getMembresíaComprada());
        }
        Cliente clienteNuevo = new Cliente(clienteDTO.getNombre(), clienteDTO.getApellidos(),
                clienteDTO.getCorreo(), clienteDTO.getTelefono(),
                clienteDTO.getContrasenia(),
                clienteDTO.getFechaNacimiento(),
                clienteDTO.getPin(),
                membresiaComprada);

        return clienteNuevo;
    }

    public static TipoMembresia adaptarTipoMembresia(TipoMembresiaDTO tipoDTO) {
        if (tipoDTO == TipoMembresiaDTO.PLATA) {
            return TipoMembresia.PLATA;
        } else if (tipoDTO == TipoMembresiaDTO.ORO) {
            return TipoMembresia.ORO;
        }
        return TipoMembresia.BRONCE;
    }

    public static TipoMembresiaDTO adaptarTipoMembresiaDTO(TipoMembresia tipo) {
        if (tipo == TipoMembresia.PLATA) {
            return TipoMembresiaDTO.PLATA;
        } else if (tipo == TipoMembresia.ORO) {
            return TipoMembresiaDTO.ORO;
        }
        return TipoMembresiaDTO.BRONCE;
    }

    

    public static EstadoDTO adaptarEstadoDTO(Estado estado) {
        if (estado == Estado.ACTIVO) {
            return EstadoDTO.ACTIVO;
        }
        return EstadoDTO.INACTIVO;
    }
    
    public static Dieta comvertirDietaADTO(DietaDTO dietaDTO){
        if(dietaDTO == null){
            return null;
        }
        Dieta entidadDieta = new Dieta();
        entidadDieta.setIdDieta(dietaDTO.idDieta());
        entidadDieta.setIdPaciente(dietaDTO.idPaciente());
        entidadDieta .setNombreDieta(dietaDTO.nombreDieta());
        entidadDieta.setFechaInicio(dietaDTO.fechaInicio());
        entidadDieta.setFechaFinal(dietaDTO.fechaFinal());
        entidadDieta.setNombreNutriologo(dietaDTO.nombreNutriologo());
        List<DiaSemanaDieta> dias = new ArrayList<>();
        if(dietaDTO.diaSemana() == null){
            for(DiaSemanaDTO diaSeEntidad: dietaDTO.diaSemana()){
                DiaSemanaDieta diaEntidad = new DiaSemanaDieta();
                diaEntidad.setNombreDiaSemanaDieta(diaSeEntidad.nombreDiaSemana());
                List<TiempoComidaDieta> listaTiemposEntidad = new ArrayList<>();
                if(diaSeEntidad.tiempoComida() != null){
                    for(TiempoComidaDietaDTO tiempoDTO: diaSeEntidad.tiempoComida()){
                        TiempoComidaDieta tiempoEntidad = new TiempoComidaDieta();
                        tiempoEntidad.setNombreTiempoComidaDIeta(tiempoDTO.nombreTiempoComidaDieta());
                        List<RegistroComida> listaRegistroEntid = new ArrayList<>();
                        if(tiempoDTO.registroComidas() != null){
                            for(RegistroComidaDTO regDTO: tiempoDTO.registroComidas()){
                                RegistroComida regEntidad = new RegistroComida(regDTO.idRC(), regDTO.idAlimento(), regDTO.idUnidadMedida(), regDTO.cantidad());
                                listaRegistroEntid.add(regEntidad);
                            }                            
                        }
                        tiempoEntidad.setRegistrosComida(listaRegistroEntid);
                        listaTiemposEntidad.add(tiempoEntidad);
                    }
                }
            diaEntidad.setTiemposComida(listaTiemposEntidad);
            dias.add(diaEntidad);
            }           
        }
        entidadDieta.setDiasSemana(dias);
        return entidadDieta;
    }
    
    public static DietaDTO convertirDietaADTO(Dieta dieta){
        if(dieta == null){
            return null;
        }
        
        List<DiaSemanaDTO> listaDiasDTO = new ArrayList<>();
        if(dieta.getDiasSemana() != null){
            for(DiaSemanaDieta diaEnt: dieta.getDiasSemana()){
                List<TiempoComidaDietaDTO> listaTiemposDTO = new ArrayList<>();
                if(diaEnt.getTiemposComida() != null){
                    for(TiempoComidaDieta tiempoEnt: diaEnt.getTiemposComida()){
                        List<RegistroComidaDTO> listaRegistrosDTO = new ArrayList<>();
                        if(tiempoEnt.getRegistrosComida() != null){
                            for(RegistroComida regEnt: tiempoEnt.getRegistrosComida()){
                                RegistroComidaDTO regDTO = new RegistroComidaDTO(regEnt.getIdRC(), regEnt.getIdAlimento(), regEnt.getIdUnidadMedida(), regEnt.getCantidad());                       
                                listaRegistrosDTO.add(regDTO);
                            }
                        }
                        TiempoComidaDietaDTO tiempoDTO = new TiempoComidaDietaDTO(tiempoEnt.getIdTCD(), tiempoEnt.getNombreTiempoComidaDIeta(), listaRegistrosDTO);
                        listaTiemposDTO.add(tiempoDTO);
                    }
                        
                }
                DiaSemanaDTO diaDTO = new DiaSemanaDTO(diaEnt.getNombreDiaSemanaDieta(), listaTiemposDTO);
                listaDiasDTO.add(diaDTO);
            }
            
        }
        return new DietaDTO(dieta.getIdDieta(), dieta.getNombreDieta(), dieta.getFechaInicio(), dieta.getFechaFinal(), dieta.getIdPaciente(), dieta.getNombreNutriologo(), listaDiasDTO);          
    }
    
    public AlimentoDTO adaptarAlimentosEntidad(Alimento entidad){
        if(entidad == null){
            return null;
        }
        ImagenDTO imagenDTO = null;
        if(entidad.getImagen() != null){
            imagenDTO = new ImagenDTO(entidad.getImagen().getIdImagen(), entidad.getImagen().getImagen());
        }
        return new AlimentoDTO(entidad.getIdAlimento(), entidad.getNombreAlimento(), entidad.getCantidad(), imagenDTO);
    }
    
    public Alimento adpatarAlimentoDTO(AlimentoDTO dto){
        if(dto == null){
            return null;
        }
        Alimento entidad = new Alimento();
        entidad.setIdAlimento(dto.idAlimento());
        entidad.setNombreAlimento(dto.nombreAlimento());
        return entidad;
    }
    
    public List<AlimentoDTO> adaptarAlimentosEntidad(List<Alimento> entidades){
        List<AlimentoDTO> dtos = new ArrayList<>();
        if(entidades != null){
            for(Alimento entidad: entidades){
                dtos.add(adaptarAlimentosEntidad(entidad));
            }
        }
        return dtos;
    }

}
