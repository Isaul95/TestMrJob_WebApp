package com.testBootReact.systemmrjobtest.service;

import com.testBootReact.systemmrjobtest.dto.CatUsuarioDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
import com.testBootReact.systemmrjobtest.model.CatUsuario;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MisServiciosServiceImpl implements MisServiciosService{

    private static org.slf4j.Logger Logger = LoggerFactory.getLogger(AyudaServiceImpl.class);

    //@Autowired
    //private


    @Override
    public CatUsuario obtenerServiciosByUsername() {
        return null;
    }

    @Override
    public Response agregarNuevoServicioDelUsuario(CatUsuarioDTO catUsuario) {
        return null;
    }


}
