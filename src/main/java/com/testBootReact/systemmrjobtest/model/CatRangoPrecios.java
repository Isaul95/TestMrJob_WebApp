package com.testBootReact.systemmrjobtest.model;

import javax.persistence.*;

@Entity
@Table(name = "cat_rango_precios")
public class CatRangoPrecios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rango")
    private Long id_rango;
    @Column(name = "precios")
    private String precios;

    public Long getId_rango() {
        return id_rango;
    }
    public void setId_rango(Long id_rango) {
        this.id_rango = id_rango;
    }
    public String getPrecios() {
        return precios;
    }
    public void setPrecios(String precios) {
        this.precios = precios;
    }
}
