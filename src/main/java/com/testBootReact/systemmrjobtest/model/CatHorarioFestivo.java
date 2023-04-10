package com.testBootReact.systemmrjobtest.model;

import javax.persistence.*;

@Entity
@Table(name = "cat_horario_festivo")
public class CatHorarioFestivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_festivo")
    private Long id_festivo;
    @Column(name = "horarios")
    private String horarios;

    public Long getId_festivo() {
        return id_festivo;
    }

    public void setId_festivo(Long id_festivo) {
        this.id_festivo = id_festivo;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }
}
