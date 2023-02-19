package com.testBootReact.systemmrjobtest.service;

import com.testBootReact.systemmrjobtest.dto.CatUsuarioDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
import com.testBootReact.systemmrjobtest.model.CatUsuario;
import com.testBootReact.systemmrjobtest.model.UsuarioRol;
import java.util.Set;

public interface UsuarioService {

    public CatUsuario obtenerUsuario(String usuario);

    public CatUsuario actualizarCategoria(CatUsuario usuario);

    public void eliminarUsuario(Long usuarioId);





    /** Peticion with Response...*/
    Response guardarUsuario(CatUsuarioDTO catUsuario);
}
