package com.mycompany.aprende_java_pdf.FicherosTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    /**
     * Realiza un programa que lea el fichero creado en el ejercicio anterior y que muestre los numeros por pantalla
     */

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader( new FileReader( "numerosPrimos1-500.txt"));
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
