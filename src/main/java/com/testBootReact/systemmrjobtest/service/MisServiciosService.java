package com.testBootReact.systemmrjobtest.service;

import com.testBootReact.systemmrjobtest.dto.MisServiciosDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
import com.testBootReact.systemmrjobtest.model.CatUsuario;
import java.util.List;


public interface MisServiciosService {

    CatUsuario obtenerServiciosByUsername();

    Response agregarNuevoServicioDelUsuario(MisServiciosDTO servicio);



    // proviene de Ayuda controller cat_ servicios por usuarios
    List<String> obtenerCatalogoServicios(MisServiciosDTO idUsuario);

    Response obtenerCatalogoPrecios();

    Response obtenerCatalogoServicios();

    Response obtenerCatalogoColonia();

    Response obtenerCatalogoEstados();

    Response obtenerCatalogoDistanciaServicio();

    Response obtenerCatalogoDiasServicio();

    Response obtenerCatalogoHorarioServicio();

    Response obtenerCatalogoHorarioFestivo();
}
