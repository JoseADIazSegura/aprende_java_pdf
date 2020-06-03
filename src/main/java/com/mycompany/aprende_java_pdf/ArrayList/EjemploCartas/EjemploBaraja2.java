package com.mycompany.aprende_java_pdf.ArrayList.EjemploCartas;

import java.util.ArrayList;
import java.util.Collections;

public class EjemploBaraja2 {
    /**
     * Modifica el programa anterior de tal forma que las cartas se muestren ordenadas.
     * Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
     * coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
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
        baraja.sort(Carta::compareTo);
        for (Carta co : baraja) {
            System.out.println(co);
        }
    }
}
