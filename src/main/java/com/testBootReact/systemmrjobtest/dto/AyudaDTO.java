package com.testBootReact.systemmrjobtest.dto;


public class AyudaDTO {

    private Long id_ayuda;
    private Long id_usuario;
    private String nombre_completo;
    private String telefono;
    private Long servicio_problema;
    private String mensaje;
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
