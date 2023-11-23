package com.mx.dongalleto.modelo;


/**
 *
 * @author Angel Roberto Martinez Castro
 * @date 22/11/2023
 * @company CODE-ING ®
 *
 */
public class Galleta {
    int idGalleta;
    int cantidad;
    String nombre;
    String descripcion;
    String fotografia;

    public Galleta() {
    }

    public Galleta(int cantidad, String nombre, String descripcion, String fotografia) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
    }

    public Galleta(int idGalleta, int cantidad, String nombre, String descripcion, String fotografia) {
        this.idGalleta = idGalleta;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
    }

    public int getIdGalleta() {
        return idGalleta;
    }

    public void setIdGalleta(int idGalleta) {
        this.idGalleta = idGalleta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Galleta{");
        sb.append("idGalleta=").append(idGalleta);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", nombre=").append(nombre);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", fotografia=").append(fotografia);
        sb.append('}');
        return sb.toString();
    }
}
