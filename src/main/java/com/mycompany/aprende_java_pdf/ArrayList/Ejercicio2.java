package com.mycompany.aprende_java_pdf.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    /**
     * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
     * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
     * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
     * y 20 elementos ambos inclusive.
     */
    public static void main(String[] args) {
        ArrayList<Integer> arregloNumeros = new ArrayList<>();
        int cantidadNumeros = (int)(Math.random()*(20-10)+10);
        int suma = 0;
        int media = 0;
        int minimo = 101;
        int maximo = 0;


        //Construccion del arreglo
        for (int i = 0; i < cantidadNumeros; i++) {
            arregloNumeros.add((int)(Math.random()*100+1));
        }

        //Metodos del arreglo
        //Suma
        for (int i = 0; i < arregloNumeros.size(); i++) {
            suma += arregloNumeros.get(i);
        }
        //Media
            media = suma / arregloNumeros.size();

        //Minimo
        for (int i = 0; i < arregloNumeros.size(); i++) {
            if (arregloNumeros.get(i)<minimo) {
                minimo = arregloNumeros.get(i);
            }
        }
        //Maximo
        for (int i = 0; i < arregloNumeros.size(); i++) {
            if (arregloNumeros.get(i)>maximo) {
                maximo = arregloNumeros.get(i);
            }
        }

        //Impresion de resultados
        System.out.println(arregloNumeros);
        System.out.println("La suma de los numeros en el arreglo es: " + suma);
        System.out.println("La media de los numeros en el arreglo es: " + media);
        System.out.println("El numero menor en el arreglo es: " + minimo);
        System.out.println("El numero mayor en el arreglo es: " + maximo);
    }
}
