package com.testBootReact.systemmrjobtest.controller;

import com.testBootReact.systemmrjobtest.dto.MisServiciosDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
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
     * Get todos servicios asignados al Usuarios - Pantalla Mis servicios (Por Categoria)
     */
    @PostMapping("/getServiciosByUsuario")
    public Response obtenerServiciosXUsuario(@RequestBody MisServiciosDTO idUsuario) throws Exception{
        try{
            return misServiciosService.obtenerServiciosByUsername(idUsuario);
        } catch (Exception e){
            Logger.info("Error en (MisServiciosController.Clas) -> guardarNuevoServicioDelUsuario" + e.getMessage());
            return new Response(500, Messages.MS500);
        }
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


/*
----  1.- Consultar servicios que tiene el usuario que ingresa por Campo -> categoria_servicio y -> Todos los campos de Mi servicios
-- Mandar el identificador del usuario que se extrae el iniciar session -> (Me falta mostrar el nombre del negocio NO ME KEDO CLARO )
POST -> http://localhost:8191/MisServicios/getServiciosByUsuario
{
    "id_usuario":"23"
}


---2.- add new services
Si el campo de -> id_tipo_servicio va en null es xq la categoria va en otro campo-> otro_tipo_servicio, se va agregar un nuevo servicio en el catalogo -> cat_servicios
Si el campo de -> rango_servicio va en null es xq el nuevo kilometro va en otro campo-> otro_kilometro, se va agregar un nuevo rango de kilometro en el catalogo -> cat_rango_servicio

{
    "id_tipo_servicio":"",
    "otro_tipo_servicio":"Zapatería",
    "descripcion":"ZAPATOS",
    "telefono":"5555555555",
    "whatsapp":"8888888888",
    "rango_precios":"3",
    "direccion":"Chilpancingo de los Bravos, Guerrero",
    "codigo_postal":"40060",
    "colonia":"2",
    "estado":"4",
    "rango_servicio":"",
    "otro_kilometro" : "0 kilometro",
    "dias_servicio":"2",
    "horario_servicio":"3",
    "dias_festivos":"Si",
    "horario_festivo":"3",
    "id_usuario":"23"
}


 */