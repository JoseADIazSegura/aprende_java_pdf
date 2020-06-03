package com.mycompany.aprende_java_pdf.ArrayList.EjemploCartas;

public class Carta {
    private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota"
            , "caballo", "rey"};
    private static String[] p = {"bastos", "copas", "espadas", "oros"};
    private String numero;
    private String palo;

    public Carta() {
        this.numero = n[(int) (Math.random() * 10)];
        this.palo = p[(int) (Math.random() * 4)];
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String toString() {
        return this.numero + " de " + this.palo;
    }

    public int compareTo(Carta g) {
        if (palo.equals(g.getPalo())){
            return (numero.compareTo(g.getNumero()));
        }else {
            return palo.compareTo(g.getPalo());
        }

    }
}
