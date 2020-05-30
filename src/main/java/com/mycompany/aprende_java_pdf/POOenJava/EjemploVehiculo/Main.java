package com.mycompany.aprende_java_pdf.POOenJava.EjemploVehiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta1 = new Bicicleta(0);
        Coche coche1 = new Coche(10000);
        int km = 0;


        Scanner scanner = new Scanner(System.in);

        int bandera = 0;
        while (bandera == 0) {
            System.out.printf("VEHICULOS\n");
            System.out.printf("========\n");
            System.out.printf("1.Anda con la bicicleta\n");
            System.out.printf("2.Has el caballito con la bicicleta\n");
            System.out.printf("3.Anda con el coche\n");
            System.out.printf("4.Quema rueda con el coche\n");
            System.out.printf("5.Ver kilometraje de la bicicleta\n");
            System.out.printf("6.Ver kilometraje del coche\n");
            System.out.printf("7.Ver kilometraje total \n");
            System.out.printf("8.Salir\n");
            System.out.printf("Eliga una opción (1-8) \n");
            int bandera2 = Integer.parseInt(scanner.nextLine());
            switch (bandera2){
                case 1:
                    System.out.printf("Cuantos kilometros quieres recorrer? \n");
                    bicicleta1.recorrer(Integer.parseInt(scanner.nextLine()));
                    break;
                case 2:
                    bicicleta1.caballito();
                    break;
                case 3:
                    System.out.printf("Cuantos kilometros quieres recorrer? \n");
                    coche1.recorrer(Integer.parseInt(scanner.nextLine()));
                    break;
                case 4:
                    coche1.quemarRueda();
                    break;
                case 5:
                    System.out.println(bicicleta1.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println(coche1.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println(Vehiculo.getKilometrosTotales());
                    break;
                case 8:
                    break;


            }
        }


    }
}
