package com.mycompany.aprende_java_pdf.FicherosTexto.Ejemplos;

import java.io.File;
import java.util.Scanner;

public class Ejemplo05 {
    /**
     * Ejemplo del uso de la clase File
     * Comprobacion de existencia y borrado de un fichero
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre del archivo que desea borrar: ");
        String nombreFichero = scanner.nextLine();

        File fichero = new File(nombreFichero);
        if(fichero.exists()){
            fichero.delete();
            System.out.println("El fichero se ha borrado correctamente");
        }else{
            System.out.println("El fichero "+ nombreFichero + " no existe.");
        }
    }
}
