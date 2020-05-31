package com.mycompany.aprende_java_pdf.POOenJava.EjemploPuntoLinea;

public class Linea {

    Punto punto1;
    Punto punto2;

    public Linea(){}
    public Linea(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public String toString(){
        return "Linea formada por los puntos " + this.getPunto1() +" y "+ this.getPunto2();
    }
}
