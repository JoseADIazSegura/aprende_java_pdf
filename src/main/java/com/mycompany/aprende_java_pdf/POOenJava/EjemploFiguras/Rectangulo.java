package com.mycompany.aprende_java_pdf.POOenJava.EjemploFiguras;

public class Rectangulo {
    private static int numRectangulos = 0;
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public static int getNumRectangulos() {
        return numRectangulos;
    }

    public static void setNumRectangulos(int numRectangulos) {
        Rectangulo.numRectangulos = numRectangulos;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String generarRectangulo(){
        String resultado = "";
        for (int altura = 1; altura <= this.altura ; altura++) {
            for(int base = 1; base <= this.base;base++){
                resultado += "*";
            }
            resultado += "\n";

        }
        setNumRectangulos(getNumRectangulos() + 1 );
        return resultado;
    }

    public String toString(){
        return generarRectangulo();
    }
}
