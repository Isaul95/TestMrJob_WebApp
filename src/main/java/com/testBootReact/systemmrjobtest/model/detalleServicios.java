package com.testBootReact.systemmrjobtest.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "detalle_servicios")
public class detalleServicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Long id_detalle;
    @Column(name = "id_tipo_servicio")
    private Long id_tipo_servicio;
    // @Column(name = "nombre_servicio")  // no se usa en esta version
    // private String nombre_servicio; // no se usa en esta version
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "whatsapp")
    private String whatsapp;
    @Column(name = "rango_precios")
    private Long rango_precios;
    // @Column(name = "tipo_servicios")  // no se usa en esta version
    // private Long tipo_servicios;  // no se usa en esta version
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "codigo_postal")
    private String codigo_postal;
    @Column(name = "colonia")
    private Long colonia;
    @Column(name = "estado")
    private Long estado;
    @Column(name = "rango_servicio")
    private Long rango_servicio;
    @Column(name = "dias_servicio")
    private Long dias_servicio;
    @Column(name = "horario_servicio")
    private Long horario_servicio;
    @Column(name = "dias_festivos")
    private String dias_festivos;
    @Column(name = "horario_festivo")
    private Long horario_festivo;
    @Column(name = "id_usuario")
    private Long id_usuario;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "servicio")
    private Set<UsuarioServicios> usuarioServicios = new HashSet<>();

    public Long getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(Long id_detalle) {
        this.id_detalle = id_detalle;
    }

    public Long getId_tipo_servicio() {
        return id_tipo_servicio;
    }

    public void setId_tipo_servicio(Long id_tipo_servicio) {
        this.id_tipo_servicio = id_tipo_servicio;
    }

    //public String getNombre_servicio() {
        //return nombre_servicio;
        //}

    //public void setNombre_servicio(String nombre_servicio) {
    //  this.nombre_servicio = nombre_servicio;
    //}

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<UsuarioServicios> getUsuarioServicios() {
        return usuarioServicios;
    }

    public void setUsuarioServicios(Set<UsuarioServicios> usuarioServicios) {
        this.usuarioServicios = usuarioServicios;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public Long getRango_precios() {
        return rango_precios;
    }

    public void setRango_precios(Long rango_precios) {
        this.rango_precios = rango_precios;
    }

//    public Long getTipo_servicios() {
//        return tipo_servicios;
//    }

//    public void setTipo_servicios(Long tipo_servicios) {
//        this.tipo_servicios = tipo_servicios;
//    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public Long getColonia() {
        return colonia;
    }

    public void setColonia(Long colonia) {
        this.colonia = colonia;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public Long getRango_servicio() {
        return rango_servicio;
    }

    public void setRango_servicio(Long rango_servicio) {
        this.rango_servicio = rango_servicio;
    }

    public Long getDias_servicio() {
        return dias_servicio;
    }

    public void setDias_servicio(Long dias_servicio) {
        this.dias_servicio = dias_servicio;
    }

    public Long getHorario_servicio() {
        return horario_servicio;
    }

    public void setHorario_servicio(Long horario_servicio) {
        this.horario_servicio = horario_servicio;
    }

    public String getDias_festivos() {
        return dias_festivos;
    }

    public void setDias_festivos(String dias_festivos) {
        this.dias_festivos = dias_festivos;
    }

    public Long getHorario_festivo() {
        return horario_festivo;
    }

    public void setHorario_festivo(Long horario_festivo) {
        this.horario_festivo = horario_festivo;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public detalleServicios() {
    }
}
