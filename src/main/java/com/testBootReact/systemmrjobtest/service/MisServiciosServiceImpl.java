package com.testBootReact.systemmrjobtest.service;

import com.testBootReact.systemmrjobtest.dto.CatRangoPreciosDTO;
import com.testBootReact.systemmrjobtest.dto.MisServiciosDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
import com.testBootReact.systemmrjobtest.model.*;
import com.testBootReact.systemmrjobtest.repository.*;
import com.testBootReact.systemmrjobtest.utilerias.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MisServiciosServiceImpl implements MisServiciosService{

    private static Logger Logger = LoggerFactory.getLogger(AyudaServiceImpl.class);

    @Autowired
    private CatServiciosRepository catServiciosRepository;
    @Autowired
    private CatRangoPreciosRepository catRangoPreciosRepository;
    @Autowired
    private CatTipoServiciosRepository catTipoServiciosRepository;
    @Autowired
    private CatColoniaRepository catColoniaRepository;
    @Autowired
    private CatEstadosRepository catEstadosRepository;
    @Autowired
    private CatRangoServicioRepository catRangoServicioRepository;
    @Autowired
    private CatDiasServicioRepository catDiasServicioRepository;
    @Autowired
    private CatHorarioServicioRepository catHorarioServicioRepository;
    @Autowired
    private CatHorarioFestivoRepository catHorarioFestivoRepository;


    @Override
    public CatUsuario obtenerServiciosByUsername() {
        return null;
    }

    @Override
    //@Transactional
    public Response agregarNuevoServicioDelUsuario(MisServiciosDTO datos) {
        Response response = new Response();
        CatServicios services = new CatServicios();

        try {
            services.setNombre_servicio(datos.getNombre_servicio());
            services.setDescripcion(datos.getDescripcion());
            services.setTelefono(datos.getTelefono());
            services.setWhatsapp(datos.getWhatsapp());
            services.setRango_precios(datos.getRango_precios());
            services.setTipo_servicios(datos.getTipo_servicios());
            services.setDireccion(datos.getDireccion());
            services.setCodigo_postal(datos.getCodigo_postal());
            services.setEstado(datos.getEstado());
            services.setColonia(datos.getColonia());
            services.setRango_servicio(datos.getRango_servicio());
            services.setDias_servicio(datos.getDias_servicio());
            services.setHorario_servicio(datos.getHorario_servicio());
            services.setDias_festivos(datos.getDias_festivos());
            services.setHorario_festivo(datos.getHorario_festivo());

            catServiciosRepository.save(services);
            Logger.info("Nuevo servicio guardado exitosamente...!");
            response.setCode(200);
            response.setDescripcion(Messages.MSEXITO_GUADAR_SERVICES);

        } catch (Exception e){
            response.setCode(500);
            response.setDescripcion(Messages.MSERROR_GUARDAR_USER);
            Logger.error("Error en (MisServiciosServiceImpl.Clas) -> agregarNuevoServicioDelUsuario");
        }
        return response;
    }




    @Override
    public List<String> obtenerCatalogoServicios(MisServiciosDTO idUsuario) {
        return catServiciosRepository.findAllServicesUsuario(idUsuario);
    }


    @Override
    public Response obtenerCatalogoPrecios() {
        Response response = new Response();
        try{
            List<CatRangoPrecios> listPrecios = catRangoPreciosRepository.findAll();
            response.setCode(200);
            response.setResult(listPrecios);
            response.setDescripcion("Datos del catalogo Rango de precios");

        } catch (Exception e){
            Logger.info("Error en (MisServiciosServiceImpl.Clas) -> obtenerCatalogoPrecios() " + e.getMessage());
            return new Response(500, Messages.MS500);
        }
        return response;
    }


    @Override
    public Response obtenerCatalogoServicios() {
        Response response = new Response();
        try{
            List<CatTipoServicios> listServices = catTipoServiciosRepository.findAll();
            response.setCode(200);
            response.setResult(listServices);
            response.setDescripcion("Datos del catalogo Tipo de servicios");

        } catch (Exception e){
            Logger.info("Error en (MisServiciosServiceImpl.Clas) -> obtenerCatalogoServicios() " + e.getMessage());
            return new Response(500, Messages.MS500);
        }
        return response;
    }

    @Override
    public Response obtenerCatalogoColonia() {
        Response response = new Response();
        try{
            List<CatColonia> listColonia = catColoniaRepository.findAll();
            response.setCode(200);
            response.setResult(listColonia);
            response.setDescripcion("Lista de colonias");

        } catch (Exception e){
            Logger.info("Error en (MisServiciosServiceImpl.Clas) -> obtenerCatalogoColonia() " + e.getMessage());
            return new Response(500, Messages.MS500);
        }
        return response;
    }

    @Override
    public Response obtenerCatalogoEstados() {
        Response response = new Response();
        try{
            List<CatEstados> listEstados = catEstadosRepository.findAll();
            response.setCode(200);
            response.setResult(listEstados);
            response.setDescripcion("Lista de Estados");

        } catch (Exception e){
            Logger.info("Error en (MisServiciosServiceImpl.Clas) -> obtenerCatalogoEstados() " + e.getMessage());
            return new Response(500, Messages.MS500);
        }
        return response;
    }

    @Override
    public Response obtenerCatalogoDistanciaServicio() {
        Response response = new Response();
        try{
            List<CatRangoServicio> listDistancia = catRangoServicioRepository.findAll();
            response.setCode(200);
            response.setResult(listDistancia);
            response.setDescripcion("Lista de Estados");

        } catch (Exception e){
            Logger.info("Error en (MisServiciosServiceImpl.Clas) -> obtenerCatalogoDistanciaServicio() " + e.getMessage());
            return new Response(500, Messages.MS500);
        }
        return response;
    }

    @Override
    public Response obtenerCatalogoDiasServicio() {
        Response response = new Response();
        try{
            List<CatDiasServicio> listDias = catDiasServicioRepository.findAll();
            response.setCode(200);
            response.setResult(listDias);
            response.setDescripcion("Días de servicio");

        } catch (Exception e){
            Logger.info("Error en (MisServiciosServiceImpl.Clas) -> obtenerCatalogoDiasServicio() " + e.getMessage());
            return new Response(500, Messages.MS500);
        }
        return response;
    }

    @Override
    public Response obtenerCatalogoHorarioServicio() {
        Response response = new Response();
        try{
            List<CatHorarioServicio> listHorarios = catHorarioServicioRepository.findAll();
            response.setCode(200);
            response.setResult(listHorarios);
            response.setDescripcion("Horarios de servicio");

        } catch (Exception e){
            Logger.info("Error en (MisServiciosServiceImpl.Clas) -> obtenerCatalogoHorarioServicio() " + e.getMessage());
            return new Response(500, Messages.MS500);
        }
        return response;
    }


    @Override
    public Response obtenerCatalogoHorarioFestivo() {
        Response response = new Response();
        try{
            List<CatHorarioFestivo> listHorariosFestivo = catHorarioFestivoRepository.findAll();
            response.setCode(200);
            response.setResult(listHorariosFestivo);
            response.setDescripcion("Horarios de servicio festivos");

        } catch (Exception e){
            Logger.info("Error en (MisServiciosServiceImpl.Clas) -> obtenerCatalogoHorarioFestivo() " + e.getMessage());
            return new Response(500, Messages.MS500);
        }
        return response;
    }

}
