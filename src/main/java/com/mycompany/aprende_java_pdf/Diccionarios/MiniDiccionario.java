package com.mycompany.aprende_java_pdf.Diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class MiniDiccionario {
    /**
     * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
     * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
     * almacenar las parejas de palabras. El programa pedirá una palabra en español
     * y dará la correspondiente traducción en inglés.
     */
    public static void main(String[] args) {
        HashMap<String,String> miniDiccionario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        miniDiccionario.put("edad","age");
        miniDiccionario.put("aire","air");
        miniDiccionario.put("animal","animal");
        miniDiccionario.put("respuesta","answer");
        miniDiccionario.put("bebe","baby");
        miniDiccionario.put("pelota","ball");
        miniDiccionario.put("cama","bed");
        miniDiccionario.put("libro","book");

        System.out.println("Ingrese la palabra a buscar: ");
        String palabra = scanner.next();
        if (miniDiccionario.containsKey(palabra)){
            System.out.println(miniDiccionario.get(palabra));
        }
    }

}
