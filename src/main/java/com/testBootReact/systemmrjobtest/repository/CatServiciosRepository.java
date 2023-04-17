package com.testBootReact.systemmrjobtest.repository;

import com.testBootReact.systemmrjobtest.model.CatServicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CatServiciosRepository extends JpaRepository<CatServicios, Long> {

    /* @Query(value = "SELECT id_servicio, nombre_servicio FROM cat_servicios WHERE id_servicio in (2,3,4,5)",nativeQuery = true)
       List<String> findAllServicesUsuario(MisServiciosDTO idUsuario);
     */

    @Query(value = "SELECT id_servicio, nombre_servicio FROM cat_servicios",nativeQuery = true)
    List<Object[]> findAllCatServices();

    @Query(value = "SELECT id_servicio, nombre_servicio FROM cat_servicios WHERE id_usuario = id_usuario",nativeQuery = true)
    List<Object[]> findServicesCategoriaByUser(Long id_usuario);
}
