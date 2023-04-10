package com.testBootReact.systemmrjobtest.controller;

import com.testBootReact.systemmrjobtest.dto.MisServiciosDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
import com.testBootReact.systemmrjobtest.model.CatUsuario;
import com.testBootReact.systemmrjobtest.service.MisServiciosService;
import com.testBootReact.systemmrjobtest.utilerias.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/MisServicios")
@CrossOrigin("*")
public class MisServiciosController {

    private static Logger Logger = LoggerFactory.getLogger(MisServiciosController.class);

    @Autowired
    private MisServiciosService misServiciosService;

    /**
     * Get todos servicios asignados al Usuarios - Pantalla Mis servicios
     * @param -u-s-e-r
     */
    @GetMapping("/")
    public CatUsuario obtenerServiciosXUsuario() {
        return misServiciosService.obtenerServiciosByUsername();
    }


    /**
     * Add new servicio por usuario - Pantalla Mis servicios
     */
    @PostMapping(value = "/nuevoServicio")
    public Response guardarNuevoServicioDelUsuario(@RequestBody MisServiciosDTO servicio) throws Exception{
        try{
            return misServiciosService.agregarNuevoServicioDelUsuario(servicio);
        } catch (Exception e){
            Logger.info("Error en (MisServiciosController.Clas) -> guardarNuevoServicioDelUsuario" + e.getMessage());
            return new Response(500, Messages.MS500);
        }
    }


    /** --------------     Obtener catalogos - combos en pantalla de Mis servicios    ---------------  */

    /**
     * Get lista de Rangos de precios - Pantalla Mis servicios
     */
    @GetMapping("/getPrecios")
    public Response getPrecios() throws Exception{
        try{
            return misServiciosService.obtenerCatalogoPrecios();
        } catch (Exception e){
            Logger.info("Error en (MisServiciosController.Clas) -> getPrecios()" + e.getMessage());
            return new Response(500, Messages.MS500);
        }
    }

    /**
     * Get lista tipo de servicios - Pantalla Mis servicios
     */
    @GetMapping("/getServicios")
    public Response getServicios() throws Exception{
        try{
            return misServiciosService.obtenerCatalogoServicios();
        } catch (Exception e){
            Logger.info("Error en (MisServiciosController.Clas) -> getServicios()" + e.getMessage());
            return new Response(500, Messages.MS500);
        }
    }


    /**
     * Get lista tipo de servicios - Pantalla Mis servicios
     */
    @GetMapping("/getColonia")
    public Response getColonia() throws Exception{
        try{
            return misServiciosService.obtenerCatalogoColonia();
        } catch (Exception e){
            Logger.info("Error en (MisServiciosController.Clas) -> getColonia()" + e.getMessage());
            return new Response(500, Messages.MS500);
        }
    }


    /**
     * Get lista de colonias - Pantalla Mis servicios
     */
    @GetMapping("/getEstados")
    public Response getEstados() throws Exception{
        try{
            return misServiciosService.obtenerCatalogoEstados();
        } catch (Exception e){
            Logger.info("Error en (MisServiciosController.Clas) -> getEstados()" + e.getMessage());
            return new Response(500, Messages.MS500);
        }
    }


    /**
     * Get lista de rango de servicios KM-DISTANCIAS - Pantalla Mis servicios
     */
    @GetMapping("/getDistanciaServicio")
    public Response getDistanciaServicio() throws Exception{
        try{
            return misServiciosService.obtenerCatalogoDistanciaServicio();
        } catch (Exception e){
            Logger.info("Error en (MisServiciosController.Clas) -> getDistanciaServicio()" + e.getMessage());
            return new Response(500, Messages.MS500);
        }
    }


    /**
     * Get lista dias de servicios - Pantalla Mis servicios
     */
    @GetMapping("/getDiasServicio")
    public Response getDiasServicio() throws Exception{
        try{
            return misServiciosService.obtenerCatalogoDiasServicio();
        } catch (Exception e){
            Logger.info("Error en (MisServiciosController.Clas) -> getDiasServicio()" + e.getMessage());
            return new Response(500, Messages.MS500);
        }
    }


    /**
     * Get lista horarios de servicios - Pantalla Mis servicios
     */
    @GetMapping("/getHorarioServicio")
    public Response getHorarioServicio() throws Exception{
        try{
            return misServiciosService.obtenerCatalogoHorarioServicio();
        } catch (Exception e){
            Logger.info("Error en (MisServiciosController.Clas) -> getHorarioServicio()" + e.getMessage());
            return new Response(500, Messages.MS500);
        }
    }


    /**
     * Get lista horarios de servicios festivos - Pantalla Mis servicios
     */
    @GetMapping("/getHorarioFestivo")
    public Response getHorarioFestivo() throws Exception{
        try{
            return misServiciosService.obtenerCatalogoHorarioFestivo();
        } catch (Exception e){
            Logger.info("Error en (MisServiciosController.Clas) -> getHorarioFestivo()" + e.getMessage());
            return new Response(500, Messages.MS500);
        }
    }

}
