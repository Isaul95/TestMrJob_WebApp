package com.testBootReact.systemmrjobtest.model;


import javax.persistence.*;

@Entity
@Table(name = "cat_dias_servicio")
public class CatDiasServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dias")
    private Long id_dias;
    @Column(name = "dias")
    private String dias;

    public Long getId_dias() {
        return id_dias;
    }

    public void setId_dias(Long id_dias) {
        this.id_dias = id_dias;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
}
