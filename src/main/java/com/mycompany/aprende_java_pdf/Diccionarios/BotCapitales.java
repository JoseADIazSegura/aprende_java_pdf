package com.mycompany.aprende_java_pdf.Diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class BotCapitales {
    public static void main(String[] args) {
        HashMap<String, String> bot = new HashMap<>();
        bot.put("España", "Madrid");
        bot.put("Portugal", "Lisboa");
        bot.put("Francia", "Paris");
        Scanner scanner = new Scanner(System.in);
        String seleccion = "";
        do {
            System.out.println("Escribe el nombre de un país y te diré su capital: ");
            seleccion = scanner.next();
            if (!seleccion.equals("salir")) {
                if (bot.containsKey(seleccion)) {
                    System.out.println("La capital de " + seleccion + "es : " + bot.get(seleccion));
                } else if (seleccion == "salir") {
                    break;
                } else {
                    System.out.println("No conosco la respuesta, ¿Cual es la capital de " + seleccion + "?: ");
                    bot.put(seleccion, scanner.next());
                }
            }
        }while (!seleccion.equals("salir"));
    }
}
