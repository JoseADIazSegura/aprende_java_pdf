package com.mycompany.aprende_java_pdf.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Escribe un programa que ordene 10 números enteros introducidos por teclado
     * y almacenados en un objeto de la clase ArrayList.
     */
    public static void main(String[] args) {
        ArrayList<Integer> arregloNumeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //Ciclo que permite al usuario ingresar en el arreglo 10 numeros enteros
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Ingrese el numero: ");
            arregloNumeros.add((scanner.nextInt()));
        }
        //Primera impresion del arreglo
        System.out.println(arregloNumeros);
        //Ordenamiento del arreglo
        arregloNumeros.sort(Integer::compareTo);
        //Segunda impresion del arreglo
        System.out.println(arregloNumeros);

    }
}
