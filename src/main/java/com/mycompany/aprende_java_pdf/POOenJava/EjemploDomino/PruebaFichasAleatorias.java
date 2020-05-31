package com.mycompany.aprende_java_pdf.POOenJava.EjemploDomino;

import java.util.LinkedList;

public class PruebaFichasAleatorias {
    public static void main(String[] args) {
        int bandera = 8;
        LinkedList<FichaDomino> arreglo = new LinkedList<>();
        int bandera2 = 0;
        for (int i = 0; i <= bandera;i++){
            FichaDomino testFicha = new FichaDomino();
            if(arreglo.isEmpty()) {
                testFicha.setLado1((int) (Math.random()*6));
                testFicha.setLado2((int) (Math.random()*6));
                arreglo.addLast(testFicha);
                bandera2 = testFicha.getLado2();
            }else{
                testFicha.setLado1(bandera2);
                testFicha.setLado2((int) (Math.random()*6));
                arreglo.addLast(testFicha);
                bandera2 = testFicha.getLado2();
            }
        }
        System.out.println(arreglo);
    }
}
