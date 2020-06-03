package com.mycompany.aprende_java_pdf.ArrayList;

import java.util.*;

public class Ejercicio4 {
    /**
     * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
     * debe ordenar palabras en lugar de números.
     */
    public static void main(String[] args) {
        ArrayList<String> arregloNPalabras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //Ciclo que permite al usuario ingresar en el arreglo 10 numeros enteros
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Ingrese la palabra: ");
            arregloNPalabras.add((scanner.nextLine()));
        }
        //Primera impresion del arreglo
        System.out.println(arregloNPalabras);
        //Ordenamiento del arreglo
        Collections.sort(arregloNPalabras);
        //Segunda impresion del arreglo
        System.out.println(arregloNPalabras);
    }
}
