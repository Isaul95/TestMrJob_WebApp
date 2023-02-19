package com.testBootReact.systemmrjobtest.repository;

import com.testBootReact.systemmrjobtest.model.CatUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatUsuarioRepository extends JpaRepository<CatUsuario, Long> {

    public CatUsuario findByUsername(String username);

}
