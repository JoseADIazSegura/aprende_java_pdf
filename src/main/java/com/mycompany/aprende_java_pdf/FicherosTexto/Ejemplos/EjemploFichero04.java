package com.mycompany.aprende_java_pdf.FicherosTexto.Ejemplos;

import java.io.File;

/**
 * Ejemplo de uso de la clase File, listando los archivos del directorio actual
 */
public class EjemploFichero04 {
    public static void main(String[] args) {
        File f = new File("."); // Se indica la ruta entre comillas
                                        // El punto (.) es el directorio actual
        String[] listaArchivos = f.list();
        for (String nombreArchivo : listaArchivos){
            System.out.println(nombreArchivo);
        }
    }
}
