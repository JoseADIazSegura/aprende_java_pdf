package com.mycompany.aprende_java_pdf.POOenJava.EjemploFiguras;

public class Piramide {
    public static int numPiramides = 0;
    public int altura;

    public Piramide(int altura) {
        this.altura = altura;
    }

    public static int getNumPiramides() {
        return numPiramides;
    }

    public static void setNumPiramides(int numPiramides) {
        Piramide.numPiramides = numPiramides;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String generarPiramide(){
        int altura = this.getAltura();
        String resultado="";
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura-i; j++) {
                resultado += " ";
            }
            for (int k = 1; k <= (i*2)-1; k++) {
                resultado += "*";
            }
            resultado += "\n";
        }
        setNumPiramides(getNumPiramides() + 1);
        return  resultado;
    }

    public String toString(){
        return generarPiramide();
    }
}
