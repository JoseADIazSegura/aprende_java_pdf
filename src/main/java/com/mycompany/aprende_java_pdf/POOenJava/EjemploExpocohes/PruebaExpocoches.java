package com.mycompany.aprende_java_pdf.POOenJava.EjemploExpocohes;

import java.util.Scanner;

public class PruebaExpocoches {

    public static void main(String[] args) {
        Zona salaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);
        Scanner scanner = new Scanner(System.in);
        boolean bandera = true;


        while (bandera) {
            int seleccion = 0;
            System.out.printf("Seleccione una opcion: \n");
            System.out.printf("1. Mostrar numero de entradas libres \n");
            System.out.printf("2. Vender entradas \n");
            System.out.printf("3. Salir \n");

            seleccion = Integer.parseInt(scanner.nextLine());
            switch (seleccion) {
                case 1:
                    System.out.printf("Que zona desea: \n");
                    System.out.printf("1. Sala principal \n");
                    System.out.printf("2. Sala compara venta \n");
                    System.out.printf("3. Sala VIP \n");

                    int seleccion2 = Integer.parseInt(scanner.nextLine());
                    switch (seleccion2) {
                        case 1:
                            System.out.println(salaPrincipal.getEntradasPorVender());
                            break;
                        case 2:
                            System.out.println(compraVenta.getEntradasPorVender());
                            break;
                        case 3:
                            System.out.println(vip.getEntradasPorVender());
                    }
                    break;
                case 2:
                    System.out.printf("Que zona desea: \n");
                    System.out.printf("1. Sala principal \n");
                    System.out.printf("2. Sala compara venta \n");
                    System.out.printf("3. Sala VIP \n");

                    int seleccion3 = Integer.parseInt(scanner.nextLine());
                    int entradasAVender = 0;
                    switch (seleccion3) {
                        case 1:
                            System.out.printf("Cuantas entradas desea? \n");
                            entradasAVender = Integer.parseInt(scanner.nextLine());
                            salaPrincipal.vender(entradasAVender);
                            break;
                        case 2:
                            System.out.printf("Cuantas entradas desea? \n");
                            entradasAVender = Integer.parseInt(scanner.nextLine());
                            compraVenta.vender(entradasAVender);
                            break;
                        case 3:
                            System.out.printf("Cuantas entradas desea? \n");
                            entradasAVender = Integer.parseInt(scanner.nextLine());
                            vip.vender(entradasAVender);
                            break;
                    }
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
