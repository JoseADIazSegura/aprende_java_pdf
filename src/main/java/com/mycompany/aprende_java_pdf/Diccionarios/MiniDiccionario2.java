package com.mycompany.aprende_java_pdf.Diccionarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class MiniDiccionario2 {
    /**
     * Realiza un programa que escoja al azar 5 palabras en español del minidiccionario
     * del ejercicio anterior. El programa irá pidiendo que el usuario teclee
     * la traducción al inglés de cada una de las palabras y comprobará si son
     * correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas
     * y cuántas erróneas.
     */

    public static void main(String[] args) {
        HashMap<String, String> miniDiccionario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        miniDiccionario.put("edad", "age");
        miniDiccionario.put("aire", "air");
        miniDiccionario.put("animal", "animal");
        miniDiccionario.put("respuesta", "answer");
        miniDiccionario.put("bebe", "baby");
        miniDiccionario.put("pelota", "ball");
        miniDiccionario.put("cama", "bed");
        miniDiccionario.put("libro", "book");

        ArrayList lista = new ArrayList();
        for (int i = 0; i < 5; i++) {
            Random generator = new Random();
            Object[] values = miniDiccionario.keySet().toArray();
            Object randomValue = values[generator.nextInt(values.length)];
            lista.add(randomValue);
        }
        System.out.println(lista);
        int correctas = 0;
        int erroneas = 0;
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Escriba la traduccion de: " + lista.get(i));
            String respuesta = scanner.next();
            String val = lista.get(i).toString();
            if (miniDiccionario.containsKey(val)) {
                if (miniDiccionario.get(val).equals(respuesta)) {
                    correctas++;
                } else {
                    erroneas++;
                }
            }
        }
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas erroneas: " + erroneas);
    }
}
