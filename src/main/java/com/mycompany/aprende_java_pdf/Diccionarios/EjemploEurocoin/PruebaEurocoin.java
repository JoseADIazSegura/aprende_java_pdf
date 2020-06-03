package com.mycompany.aprende_java_pdf.Diccionarios.EjemploEurocoin;

import java.util.ArrayList;

public class PruebaEurocoin {
    /**
     * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
     * un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
     * anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
     * céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
     * cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
     * siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
     * la clase Moneda y la secuencia se debe ir almacenando en una lista.
     */
    public static void main(String[] args) {
        ArrayList<Moneda> euroCoin = new ArrayList<>();
        Moneda test = new Moneda();
        Moneda test2 = new Moneda();
        while (euroCoin.size() < 6){
            if (euroCoin.isEmpty()){
                euroCoin.add(test);
            }else if (test2.getPosicion().equals(test.getPosicion()) || test2.getCantidad().equals(test.getCantidad())){
                euroCoin.add(test2);
                test = test2;
                test2 = new Moneda();
            }else {
                test2 = new Moneda();
            }
        }
        for (Moneda mo : euroCoin){
            System.out.println(mo);
        }

    }
}
