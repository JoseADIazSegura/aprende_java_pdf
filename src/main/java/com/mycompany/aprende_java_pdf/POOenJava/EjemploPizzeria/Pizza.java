package com.mycompany.aprende_java_pdf.POOenJava.EjemploPizzeria;

public class Pizza {

    // Atributos de la clase Pizza
    private String tipo;
    private String tamano;
    private String estado;
    private static int totalPedidas;
    private static int totalServidas;

    // Constructores de la clase Pizza
    public Pizza(){}
    public Pizza(String tipo, String tamano) {
        this.tipo = tipo;
        this.tamano = tamano;
        this.estado = "pedida";
        Pizza.totalPedidas++;
    }
    //Encapsulamiento de los atributos de la Clase Pizza
    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static void setTotalPedidas(int totalPedidas) {
        Pizza.totalPedidas = totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public static void setTotalServidas(int totalServidas) {
        Pizza.totalServidas = totalServidas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Metodos de la clase Pizza

    public void sirve(){
        if (this.estado == "Servida"){
            System.out.printf("Esta pizza ya se ha servido\n");
        }else {
            this.estado = "Servida";
            Pizza.totalServidas++;
        }
    }

    public String toString() {
        return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
    }
}
