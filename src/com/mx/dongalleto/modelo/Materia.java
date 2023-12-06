/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.dongalleto.modelo;

public class Materia {
    
    int id;
    double cantidad;
    String nombre;
    String unidadMedida;
    String proveedor;
    String fechaCompra;
    double precioUnitario;
    String fotografia;

    public Materia() {
    }

    public Materia(double cantidad, String nombre, String unidadMedida, String proveedor, String fechaCompra, double precioUnitario, String fotografia) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.proveedor = proveedor;
        this.fechaCompra = fechaCompra;
        this.precioUnitario = precioUnitario;
        this.fotografia = fotografia;
    }

    public Materia(int id, double cantidad, String nombre, String unidadMedida, String proveedor, String fechaCompra, double precioUnitario, String fotografia) {
        this.id = id;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.proveedor = proveedor;
        this.fechaCompra = fechaCompra;
        this.precioUnitario = precioUnitario;
        this.fotografia = fotografia;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
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
        sb.append("Materia{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", unidadMedida=").append(unidadMedida);
        sb.append(", proveedor=").append(proveedor);
        sb.append(", fechaCompra=").append(fechaCompra);
        sb.append(", precioUnitario=").append(precioUnitario);
        sb.append(", fotografia=").append(fotografia);
        sb.append('}');
        return sb.toString();
    }    
}
