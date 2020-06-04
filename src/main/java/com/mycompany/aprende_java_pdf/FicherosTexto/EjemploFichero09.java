package com.mycompany.aprende_java_pdf.FicherosTexto;

import java.io.*;

/**
 * Ejemplo de uso de la clase File
 * Calcula la media de los numeros que se encuentran en el fichero de texto
 * El nombre del fichero se pasa como argumento en la linea de comandos
 */
public class EjemploFichero09 {
    public static void main(String[] args) {

        if (args.length != 1){
            System.out.println("Este progrmaa calcula la media de los numeros contenidos en un fichero");
            System.out.println("Uso del programa: java EjemploFichero09 FICHERO");
            System.exit(-1);
        }
        try{
            BufferedReader bf = new BufferedReader(new FileReader(args[0]));

            String linea = "0";
            int i = 0;
            double suma = 0;

            while (linea != null){
                i++;
                suma += Double.parseDouble(linea);
                linea = bf.readLine();
            }
            i--;

            bf.close();
            System.out.println("La media es " + suma/(double)i);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
