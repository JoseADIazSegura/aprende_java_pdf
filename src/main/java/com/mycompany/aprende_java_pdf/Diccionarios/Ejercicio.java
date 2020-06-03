package com.mycompany.aprende_java_pdf.Diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio {
    /**
     * Implementa el control de acceso al área restringida de un programa. Se debe
     * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
     * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
     * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
     * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
     * de usuario con sus correspondientes contraseñas deben estar almacenados en
     * una estructura de la clase HashMap.
     */
    public static void main(String[] args) {
        HashMap<String, String> usuarios = new HashMap<>();
        usuarios.put("user1", "15689");
        usuarios.put("user2", "isoadkas");
        usuarios.put("user3", "portelasd5454");
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        String user = "";
        String pass = "";

        while (contador < 3) {
            System.out.println("Ingrese el nombre de usuario: ");
            user = scanner.next();
            System.out.println("Ingrese la contraseña: ");
            pass = scanner.next();
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.containsKey(user)) {
                    if (usuarios.get(user).equals(pass)) {
                        System.out.println("Ha accedido al area restringida");
                        break;
                    }
                }
            }
            contador++;
            break;
        }
        if (contador >= 3) {
            System.out.println("Lo siento, no tiene acceso al area restringida");
        }
    }
}
