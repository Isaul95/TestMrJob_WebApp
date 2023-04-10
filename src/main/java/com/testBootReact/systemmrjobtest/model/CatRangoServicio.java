package com.testBootReact.systemmrjobtest.model;


import javax.persistence.*;

@Entity
@Table(name = "cat_rango_servicio")
public class CatRangoServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rango")
    private Long id_rango;
    @Column(name = "rango")
    private String rango;

    public Long getId_rango() {
        return id_rango;
    }

    public void setId_rango(Long id_rango) {
        this.id_rango = id_rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
}
