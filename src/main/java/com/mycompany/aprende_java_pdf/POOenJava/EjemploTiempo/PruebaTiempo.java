package com.mycompany.aprende_java_pdf.POOenJava.EjemploTiempo;

public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo tiempo1 = new Tiempo(0,30,40);
        Tiempo tiempo2 = new Tiempo(0,35,20);

        System.out.println(tiempo1);
        System.out.println(tiempo2);

        System.out.println(tiempo1.sumar(tiempo1,tiempo2));

    }
}
