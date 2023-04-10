package com.testBootReact.systemmrjobtest.model;

import javax.persistence.*;

@Entity
@Table(name = "cat_horario_servicio")
public class CatHorarioServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario")
    private Long id_horario;
    @Column(name = "horarios")
    private String horarios;

    public Long getId_horario() {
        return id_horario;
    }

    public void setId_horario(Long id_horario) {
        this.id_horario = id_horario;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }
}
