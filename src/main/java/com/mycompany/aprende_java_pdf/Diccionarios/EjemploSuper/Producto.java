package com.mycompany.aprende_java_pdf.Diccionarios.EjemploSuper;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private double subTotal;

    public Producto(){}
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public Producto(String nombre, double precio, int cantidad, double subTotal) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
