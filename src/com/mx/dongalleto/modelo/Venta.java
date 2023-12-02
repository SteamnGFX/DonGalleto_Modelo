package com.mx.dongalleto.modelo;

public class Venta {
    int idVenta;
    Galleta galleta;
    int cantidad;
    int tipo;
    String fechaVenta;

    public Venta() {
    }

    public Venta(Galleta galleta, int cantidad, int tipo, String fechaVenta) {
        this.galleta = galleta;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.fechaVenta = fechaVenta;
    }

    public Venta(int idVenta, Galleta galleta, int cantidad, int tipo, String fechaVenta) {
        this.idVenta = idVenta;
        this.galleta = galleta;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.fechaVenta = fechaVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Galleta getGalleta() {
        return galleta;
    }

    public void setGalleta(Galleta galleta) {
        this.galleta = galleta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venta{");
        sb.append("idVenta=").append(idVenta);
        sb.append(", galleta=").append(galleta);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", tipo=").append(tipo);
        sb.append(", fechaVenta=").append(fechaVenta);
        sb.append('}');
        return sb.toString();
    }
}
