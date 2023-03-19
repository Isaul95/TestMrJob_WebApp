package com.testBootReact.systemmrjobtest.service;

import com.testBootReact.systemmrjobtest.dto.CatUsuarioDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
import com.testBootReact.systemmrjobtest.model.CatUsuario;

public interface MisServiciosService {

    CatUsuario obtenerServiciosByUsername();

    Response agregarNuevoServicioDelUsuario(CatUsuarioDTO catUsuario);

}
