package com.testBootReact.systemmrjobtest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cat_usuarios")
public class CatUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id_usuario;
    @Column(name = "id_rol")
    private Long idRol;
    @Column(name = "id_negocios")
    private Long idNegocios;
    @Column(name = "nombre_completo")
    private String nombre_completo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "primer_apellido")
    private String primer_apellido;
    @Column(name = "segundo_apellido")
    private String segundo_apellido;
    @Column(name = "email")
    private String email;
    @Column(name = "activo")
    private int activo;
    @Column(name = "password")
    private String password;
    //private String perfil;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "username")
    private String username;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "edad")
    private int edad;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "rfc")
    private String rfc;
    @Column(name = "curp")
    private String curp;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_registro;
    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_actualizacion;

    /*    //Lo que hace este atributo antes de registrar agregue la fecha inmediantamente, una funcionalidad de Spring Boot*/
    @PrePersist
    public void prePersist(){
        this.fecha_registro = new Date();
    }

    //*Lo que hace este atributo es cada vez que se actualiza el registro actualiza la fecha inmediantamente, una funcionalidad de Spring Boot
    @PreUpdate
    public void preUpdate(){
        this.fecha_actualizacion = new Date();
    }
    /* https://www.youtube.com/watch?v=037HAqO0Iz8 - SPRING BOOT | JPA (Entity y Repository)     */



    /**    1 usuario va a poder tener muchos roles   */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuario")
    @JsonIgnore //a la hora de listar se esta deserializando, estamos obteniendo JSON con el EAGER CICLA LOS DATOS REPEDITOS
    private Set<UsuarioRol> usuarioRoles = new HashSet<>();


    /**    1 usuario va a poder tener muchos servicios     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuario")
    @JsonIgnore
    private Set<UsuarioServicios> usuarioServicios = new HashSet<>();


    /**    1 usuario va a poder tener muchos negocios     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuario")
    @JsonIgnore
    private Set<UsuarioNegocios> usuarioNegocios = new HashSet<>();



    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public Long getIdNegocios() {
        return idNegocios;
    }

    public void setIdNegocios(Long idNegocios) {
        this.idNegocios = idNegocios;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }


/*public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }*/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    /** ------------   Esta parte son para el JWT Token   ------------ */
    /**@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //return null;
        Set<Authority> autoridades = new HashSet<>();
        this.usuarioRoles.forEach(usuarioRol ->{
            autoridades.add(new Authority(usuarioRol.getRol().getNombreRol()));
        });
        return autoridades;
    }

    @Override
    public boolean isAccountNonExpired() {
        //return false; va a estar activo x cierto tiempo pero SI tiene que expirar, x eso se cambia de false - true
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        //return false;
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        //return false;
        return true;
    }

    // Este atributo debe ser en true para poder generar el token
    @Override
    public boolean isEnabled() {
        //return false;
        return true;
    }
*/
    public void setUsername(String username) {
        this.username = username;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    /*public Date getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }*/

    public Date getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(Date fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    /*
    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }
    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }*/

    public Set<UsuarioRol> getUsuarioRoles() {
        return usuarioRoles;
    }

    public void setUsuarioRoles(Set<UsuarioRol> usuarioRoles) {
        this.usuarioRoles = usuarioRoles;
    }

    public Set<UsuarioServicios> getUsuarioServicios() {
        return usuarioServicios;
    }

    public void setUsuarioServicios(Set<UsuarioServicios> usuarioServicios) {
        this.usuarioServicios = usuarioServicios;
    }

    public Set<UsuarioNegocios> getUsuarioNegocios() {
        return usuarioNegocios;
    }

    public void setUsuarioNegocios(Set<UsuarioNegocios> usuarioNegocios) {
        this.usuarioNegocios = usuarioNegocios;
    }

    public CatUsuario() {
    }
}
