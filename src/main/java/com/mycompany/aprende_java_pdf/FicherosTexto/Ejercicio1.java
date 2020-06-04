package com.mycompany.aprende_java_pdf.FicherosTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    /**
     * Escribe un programa que guarde en un fichero con nombre primos.dat los
     * números primos que hay entre 1 y 500.
     */
    public static void main(String[] args) {
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("numerosPrimos1-500.txt"));
            for (int i = 1; i < 500; i++) {
                int contador = 0;
                for (int j = 1; j < i; j++) {
                    if ((i % j) == 0){
                        contador++;
                    }
                }
                if (contador<2){
                    bf.write(i + " - ");
                }

            }
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
