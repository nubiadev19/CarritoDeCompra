/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO 14ALC6
 */
public class Usuario {
    private String identificacion;
    private String nombreUsuario;
    private String email;
    private String clave;
    private String rol;
    private String estado;

    public Usuario(String identificacion, String nombreUsuario, String email, String clave, String rol, String estado) {
        this.identificacion = identificacion;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.clave = clave;
        this.rol = rol;
        this.estado = estado;
    }

    public Usuario(String email, String clave) {
        this.email = email;
        this.clave = clave;
    }
    
    public Usuario() {
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return   "identificacion=" + identificacion + ", nombreUsuario=" + nombreUsuario + ", email=" + email + ", clave=" + clave + ", rol=" + rol + ", estado=" + estado;
    }
    
    
}
