package com.mx.dongalleto.modelo;


/**
 *
 * @author Angel Roberto Martinez Castro
 * @date 22/11/2023
 * @company CODE-ING ®
 *
 */

public class Usuario {

    int idUsuario;
    String nombre_usuario;
    String contrasenia;
    

    public Usuario() {
    }

    public Usuario(String nombre_usuario, String contrasenia) {
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
    }

    public Usuario(int idUsuario, String nombre_usuario, String contrasenia) {
        this.idUsuario = idUsuario;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("idUsuario=").append(idUsuario);
        sb.append(", nombre_usuario=").append(nombre_usuario);
        sb.append(", contrasenia=").append(contrasenia);
        sb.append('}');
        return sb.toString();
    }
}
