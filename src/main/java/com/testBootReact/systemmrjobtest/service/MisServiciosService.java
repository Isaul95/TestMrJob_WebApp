package com.testBootReact.systemmrjobtest.service;

import com.testBootReact.systemmrjobtest.dto.MisServiciosDTO;
import com.testBootReact.systemmrjobtest.dto.Response;

public interface MisServiciosService {

    Response agregarNuevoServicioDelUsuario(MisServiciosDTO servicio);

    Response obtenerCatalogoPrecios();

    Response obtenerCatalogoServicios();

    Response obtenerCatalogoColonia();

    Response obtenerCatalogoEstados();

    Response obtenerCatalogoDistanciaServicio();

    Response obtenerCatalogoDiasServicio();

    Response obtenerCatalogoHorarioServicio();

    Response obtenerCatalogoHorarioFestivo();

    Response obtenerServiciosByUsername(MisServiciosDTO idUsuario);
}
