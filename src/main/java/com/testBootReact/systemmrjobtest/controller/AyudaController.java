package com.testBootReact.systemmrjobtest.controller;

import com.testBootReact.systemmrjobtest.dto.AyudaDTO;
import com.testBootReact.systemmrjobtest.dto.MisServiciosDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
import com.testBootReact.systemmrjobtest.model.Ayuda;
import com.testBootReact.systemmrjobtest.model.CatServicios;
import com.testBootReact.systemmrjobtest.service.AyudaService;
import com.testBootReact.systemmrjobtest.service.MisServiciosService;
import com.testBootReact.systemmrjobtest.utilerias.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ayuda")
@CrossOrigin("*")
public class AyudaController {

    private static Logger Logger = LoggerFactory.getLogger(AyudaController.class);

    @Autowired
    private AyudaService ayudaService;
    @Autowired
    private MisServiciosService misServiciosService;

    /**
     * Get lista todos servicios - Pantalla Ayuda
     */
    @PostMapping("/getServicios")
    public List<String> getServiciosUsuario(@RequestBody MisServiciosDTO idUsuario) {
        return misServiciosService.obtenerCatalogoServicios(idUsuario);
    }


    /**
     * Add contacto soporte - Pantalla - Ayuda
     */
    @PostMapping(value = "/addContactoAyuda")
    public Response guardarContactoASoporte(@RequestBody AyudaDTO datos) throws Exception{
        try{
            return ayudaService.guardarContactoSoporte(datos);
        } catch (Exception e){
            Logger.info("Error en (AyudaController.Clas) -> guardarContactoASoporte" + e.getMessage());
            return new Response(500, Messages.MS500);
        }
    }

}
