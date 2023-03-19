package com.testBootReact.systemmrjobtest.service;

import com.testBootReact.systemmrjobtest.dto.CatUsuarioDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
import com.testBootReact.systemmrjobtest.model.CatUsuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AyudaServiceImpl implements AyudaService{

    private static org.slf4j.Logger Logger = LoggerFactory.getLogger(AyudaServiceImpl.class);

    //@Autowired
    //private

    @Override
    public CatUsuario obtenerCatalogoServicios() {
        return null;
    }

    @Override
    public Response guardarContactoSoporte(CatUsuarioDTO catUsuario) {
        return null;
    }
}
