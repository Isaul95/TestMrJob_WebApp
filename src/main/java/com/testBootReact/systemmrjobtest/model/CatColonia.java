package com.testBootReact.systemmrjobtest.model;


import javax.persistence.*;

@Entity
@Table(name = "cat_colonia")
public class CatColonia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_colonia")
    private Long id_colonia;
    @Column(name = "colonia")
    private String colonia;
    @Column(name = "clave")
    private String clave;

    public Long getId_colonia() {
        return id_colonia;
    }

    public void setId_colonia(Long id_colonia) {
        this.id_colonia = id_colonia;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
