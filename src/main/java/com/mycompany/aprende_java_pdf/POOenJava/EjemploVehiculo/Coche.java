package com.mycompany.aprende_java_pdf.POOenJava.EjemploVehiculo;

public class Coche extends Vehiculo {

    public Coche(int kilometrosRecorridos) {
        super(kilometrosRecorridos);
    }

    public void conducir() {
        setKilometrosRecorridos(getKilometrosRecorridos() + 10);
        setKilometrosTotales(getKilometrosTotales() + 10);
    }


    public void quemarRueda() {
    }
}
