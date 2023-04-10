package com.testBootReact.systemmrjobtest.service;

import com.testBootReact.systemmrjobtest.dto.AyudaDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
import com.testBootReact.systemmrjobtest.model.Ayuda;
import com.testBootReact.systemmrjobtest.repository.AyudaRepository;
import com.testBootReact.systemmrjobtest.utilerias.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AyudaServiceImpl implements AyudaService{

    private static Logger Logger = LoggerFactory.getLogger(AyudaServiceImpl.class);

    @Autowired
    private AyudaRepository ayudaRepository;


    @Override
    public Response guardarContactoSoporte(AyudaDTO datos) {
        Response response = new Response();
        Ayuda ayuda = new Ayuda();

        try {
            ayuda.setId_usuario(datos.getId_usuario());
            ayuda.setNombre_completo(datos.getNombre_completo());
            ayuda.setTelefono(datos.getTelefono());
            ayuda.setServicio_problema(datos.getServicio_problema());
            ayuda.setMensaje(datos.getMensaje());
            ayuda.setEmail(datos.getEmail());
            ayudaRepository.save(ayuda);

            Logger.info("Contactor a soporte notificado exitosamente...!");
            response.setCode(200);
            response.setDescripcion(Messages.MSEXITO_GUADAR_SOPORTE);

        } catch (Exception e){
            response.setCode(500);
            response.setDescripcion("Error al guardar contacto a soporte");
            Logger.error("Error en (AyudaServiceImpl.Clas) -> guardarContactoSoporte");
        }
        return response;
    }


}
