package com.mycompany.aprende_java_pdf.FicherosTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFichero02 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("fruta.txt"));
            bw.write("naranja\n");
            bw.write("mango\n");
            bw.write("chirimoya\n");

            bw.close();
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}
