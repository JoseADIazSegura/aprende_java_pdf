package com.mycompany.aprende_java_pdf.POOenJava.EjemploVehiculo;

public abstract class Vehiculo {

    //Atributos de la clase
    private static int vehiculosCreados;
    private static int kilometrosTotales;
    private int kilometrosRecorridos = 0;


    //Constructor de la clase
    public Vehiculo(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        setKilometrosTotales(getKilometrosTotales()+kilometrosRecorridos);
    }

    //Encapsulamiento de la clase
    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static void setKilometrosTotales(int kilometrosTotales) {
        Vehiculo.kilometrosTotales = kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public void recorrer(int km){
        setKilometrosTotales(getKilometrosTotales() + km);
        setKilometrosRecorridos(getKilometrosRecorridos() + km);
    }



}
