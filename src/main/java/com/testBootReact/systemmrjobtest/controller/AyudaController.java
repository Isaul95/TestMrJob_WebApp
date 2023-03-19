package com.testBootReact.systemmrjobtest.controller;

import com.testBootReact.systemmrjobtest.dto.CatUsuarioDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
import com.testBootReact.systemmrjobtest.model.CatUsuario;
import com.testBootReact.systemmrjobtest.service.AyudaService;
import com.testBootReact.systemmrjobtest.utilerias.Messages;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ayuda")
@CrossOrigin("*")
public class AyudaController {

    private static org.slf4j.Logger Logger = LoggerFactory.getLogger(AyudaController.class);

    @Autowired
    private AyudaService ayudaService;

    /**
     * Get lista todos servicios - Pantalla Ayuda
     */
    @GetMapping("/")
    public CatUsuario obtenerCatServicios() {
        return ayudaService.obtenerCatalogoServicios();
    }


    /**
     * Add contacto soporte - Pantalla - Ayuda
     */
    @PostMapping(value = "/addContaAyuda")
    public Response guardarContactoASoporte(@RequestBody CatUsuarioDTO catUsuario) throws Exception{
        try{
            return ayudaService.guardarContactoSoporte(catUsuario);
        } catch (Exception e){
            Logger.info("Error en (AyudaController.Clas) -> guardarContactoASoporte" + e.getMessage());
            return new Response(500, Messages.MS500);
        }
    }

}
