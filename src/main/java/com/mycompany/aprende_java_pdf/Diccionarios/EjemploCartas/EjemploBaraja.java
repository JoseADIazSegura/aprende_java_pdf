package com.mycompany.aprende_java_pdf.Diccionarios.EjemploCartas;

import java.util.ArrayList;

public class EjemploBaraja {
    /**
     * Realiza un programa que escoja al azar 10 cartas de la baraja española
     * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
     * almacenarlas y asegúrate de que no se repite ninguna.
     */
    public static void main(String[] args) {
        ArrayList<Carta> baraja = new ArrayList<>();
        while (baraja.size() < 10) {
            Carta carta = new Carta();
            if (baraja.isEmpty()) {
                baraja.add(carta);
                carta = new Carta();
            }
            for (int i = 0; i < 10; i++) {
                if (!(baraja.get(i).getNumero().equals(carta.getNumero()) && baraja.get(i).getPalo().equals(carta.getPalo()))) {
                    baraja.add(carta);
                    carta = new Carta();
                }
            }
        }
        for (Carta co : baraja) {
            System.out.println(co);
        }
    }
}
