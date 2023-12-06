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
    float peso;
    float precio;

    public Galleta() {
    }

    public Galleta(int cantidad, String nombre, String descripcion, String fotografia, float peso, float precio) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
        this.peso = peso;
        this.precio = precio;
    }

    public Galleta(int idGalleta, int cantidad, String nombre, String descripcion, String fotografia, float peso, float precio) {
        this.idGalleta = idGalleta;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
        this.peso = peso;
        this.precio = precio;
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
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
        sb.append(", peso=").append(peso);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
