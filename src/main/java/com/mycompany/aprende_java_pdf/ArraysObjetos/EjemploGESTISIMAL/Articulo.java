package com.mycompany.aprende_java_pdf.ArraysObjetos.EjemploGESTISIMAL;

public class Articulo {

    //Atributos de la clase articulo
    private int codigo;
    private String descripcion;
    private int precioCompra;
    private int precioVenta;
    private int stock;

    //Constructor de la clase Articulo

    public Articulo() {
        this.codigo = -1;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
