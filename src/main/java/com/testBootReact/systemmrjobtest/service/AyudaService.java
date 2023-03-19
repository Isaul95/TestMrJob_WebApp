package com.testBootReact.systemmrjobtest.service;

import com.testBootReact.systemmrjobtest.dto.CatUsuarioDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
import com.testBootReact.systemmrjobtest.model.CatUsuario;

public interface AyudaService {

    CatUsuario obtenerCatalogoServicios();
    Response guardarContactoSoporte(CatUsuarioDTO catUsuario);

}
