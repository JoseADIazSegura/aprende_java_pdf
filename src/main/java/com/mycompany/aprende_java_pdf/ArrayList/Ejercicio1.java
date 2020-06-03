package com.mycompany.aprende_java_pdf.ArrayList;

import java.util.ArrayList;

public class Ejercicio1 {
    /**
     * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
     * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
     * todo el ArrayList sin usar ningún índice.
     */
    public static void main(String[] args) {
        //Creacion del Arraylist arreglo
        ArrayList<String> arreglo = new ArrayList<>();
        //Ingreso de los nombres en el arreglo
        arreglo.add("Nombre1");
        arreglo.add("Nombre2");
        arreglo.add("Nombre3");
        arreglo.add("Nombre4");
        arreglo.add("Nombre5");
        arreglo.add("Nombre6");

        //Ciclo del recorrido del arreglo, impresion de cada elemento
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println(arreglo.get(i));
        }
    }
}
