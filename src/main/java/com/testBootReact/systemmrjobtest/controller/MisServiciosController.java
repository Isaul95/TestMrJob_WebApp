package com.testBootReact.systemmrjobtest.controller;

import com.testBootReact.systemmrjobtest.dto.CatUsuarioDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
import com.testBootReact.systemmrjobtest.model.CatUsuario;
import com.testBootReact.systemmrjobtest.service.MisServiciosService;
import com.testBootReact.systemmrjobtest.utilerias.Messages;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/MisServicios")
@CrossOrigin("*")
public class MisServiciosController {

    private static org.slf4j.Logger Logger = LoggerFactory.getLogger(MisServiciosController.class);

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
    @PostMapping(value = "/addContaAyuda")
    public Response guardarNuevoServicioDelUsuario(@RequestBody CatUsuarioDTO catUsuario) throws Exception{
        try{
            return misServiciosService.agregarNuevoServicioDelUsuario(catUsuario);
        } catch (Exception e){
            Logger.info("Error en (MisServiciosController.Clas) -> guardarNuevoServicioDelUsuario" + e.getMessage());
            return new Response(500, Messages.MS500);
        }
    }


}
