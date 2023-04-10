package com.testBootReact.systemmrjobtest.repository;

import com.testBootReact.systemmrjobtest.dto.MisServiciosDTO;
import com.testBootReact.systemmrjobtest.model.CatServicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface CatServiciosRepository extends JpaRepository<CatServicios, Long> {

    /* -- ESTA CONSULTA ES PARA TRAER LA LISTA DE SERVICIOS ASOCIADOS AL USUARIO -(PERO TENGO DUDAS AUN...)
     * SELECT cu.nombre_completo, cs.nombre_servicio FROM cat_usuarios cu
     * LEFT JOIN cat_negocios cn ON cn.id = cu.id_negocios
     * LEFT JOIN cat_servicios cs ON cs.id_servicio = cn.id_servicios
     * WHERE cu.id_usuario = 20;
     */
    @Query(value = "SELECT id_servicio, nombre_servicio FROM cat_servicios WHERE id_servicio in (2,3,4,5)",nativeQuery = true)
    List<String> findAllServicesUsuario(MisServiciosDTO idUsuario);



}
