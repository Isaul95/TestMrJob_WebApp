package com.testBootReact.systemmrjobtest.model;

import javax.persistence.*;

@Entity
@Table(name = "cat_estados")
public class CatEstados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado")
    private Long id_estado;
    @Column(name = "estado")
    private String estado;
    @Column(name = "clave")
    private String clave;

    public Long getId_estado() {
        return id_estado;
    }

    public void setId_estado(Long id_estado) {
        this.id_estado = id_estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
