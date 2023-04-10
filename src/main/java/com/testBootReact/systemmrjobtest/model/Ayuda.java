package com.testBootReact.systemmrjobtest.model;

import javax.persistence.*;

@Entity
@Table(name = "ayuda")
public class Ayuda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ayuda")
    private Long id_ayuda;
    @Column(name = "id_usuario")
    private Long id_usuario;
    @Column(name = "nombre_completo")
    private String nombre_completo;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "servicio_problema")
    private Long servicio_problema;
    @Column(name = "mensaje")
    private String mensaje;
    @Column(name = "email")
    private String email;

    public Long getId_ayuda() {
        return id_ayuda;
    }

    public void setId_ayuda(Long id_ayuda) {
        this.id_ayuda = id_ayuda;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getServicio_problema() {
        return servicio_problema;
    }

    public void setServicio_problema(Long servicio_problema) {
        this.servicio_problema = servicio_problema;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
