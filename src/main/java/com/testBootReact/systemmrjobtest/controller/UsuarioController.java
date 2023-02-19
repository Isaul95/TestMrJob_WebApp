package com.testBootReact.systemmrjobtest.controller;

import com.testBootReact.systemmrjobtest.dto.CatUsuarioDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
import com.testBootReact.systemmrjobtest.model.CatUsuario;
import com.testBootReact.systemmrjobtest.service.UsuarioService;
import com.testBootReact.systemmrjobtest.utilerias.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*") /** Para poder aceptar intercambio de recursos mediante http client, peticion GET, POST, ETC...  */
public class UsuarioController {
    /**
     * DEBUG: Usado para escribir mensajes de depuración
     * INFO: Mensajes de estilo verbose. Puramente informativos de determinada acción
     * WARN: Para alertar de eventos de los que se requiere dejar constancia pero que no afectan el funcionamiento de la aplicación
     * ERROR: Usado para los mensajes de eventos que afectan al programa pero lo dejan seguir funcionando. Algún parametro no es correcto
     *        pero se carga el parametro por defecto, por ejemplo.
     * FATAL: Usado para errores criticos. Normalmente después de guardar el mensaje el programa terminará.
     */

    private static Logger Logger = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioService usuarioService;

    //@Autowired
    //private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping(value = "/")  //addNewUserResp
    public Response guardarUsuario(@RequestBody CatUsuarioDTO catUsuario) throws Exception{
        try{
            return usuarioService.guardarUsuario(catUsuario);
        } catch (Exception e){
            Logger.info("Error en (UsuarioController.Clas) -> guardarUsuario" + e.getMessage());
            return new Response(500, Messages.MS500);
        }
    }

    /**
     * Get user - username - LOGIN
     * @param username
     * @return
     */
    @GetMapping("/{username}")
    public CatUsuario obtenerUsuario(@PathVariable("username") String username) {
        return usuarioService.obtenerUsuario(username);
    }

    /**
     * Update dates user
     * @param categoria
     * @return
     */
    @PutMapping("/updateUser")
    public CatUsuario actualizarUsuario(@RequestBody CatUsuario categoria){
        return usuarioService.actualizarCategoria(categoria);
    }


    /**
     * Delete user - usuarioId
     * @param usuarioId
     */
    @DeleteMapping("/{usuarioId}")
    public void eliminarUsuario(@PathVariable("usuarioId") Long usuarioId) {
        usuarioService.eliminarUsuario(usuarioId);
    }

}
