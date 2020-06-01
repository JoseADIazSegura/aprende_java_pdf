package com.mycompany.aprende_java_pdf.ArraysObjetos.EjemploDiscos;

import java.util.Scanner;

public class ColeccionDeDiscos {
    // N determina el tamaño de la coleccion de discos
    static int N = 100;

    public static void main(String[] args) {
        //Creacion del album de discos
        Disco[] album = new Disco[N];
        //Creacion de todos los discos del album
        for (int i = 0; i < N; i++) {
            album[i] = new Disco();
        }

        int opcion;
        String codigoIntroducido;
        String autorIntroducido;
        String tituloIntroducido;
        String generoIntroducido;
        String duracionIntroducidaString;
        int duracionIntroducida;
        int primeraLibre;
        int i;
        Scanner scanner = new Scanner(System.in);

        album[0].setCodigo("0");
        album[0].setAutor("BonJovi");
        album[0].setTitulo("Living");
        album[0].setGenero("Rock");
        album[0].setDuracion(35);
        album[1].setCodigo("1");
        album[1].setAutor("BonJovi");
        album[1].setTitulo("Living");
        album[1].setGenero("Metal");
        album[1].setDuracion(45);
        album[2].setCodigo("2");
        album[2].setAutor("ACDC");
        album[2].setTitulo("Highway");
        album[2].setGenero("Metal");
        album[2].setDuracion(25);
        album[3].setCodigo("4");
        album[3].setAutor("ACDC");
        album[3].setTitulo("Living2");
        album[3].setGenero("Rock");
        album[3].setDuracion(40);

        do {
            System.out.println("\n\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                //Opcion generar listado de discos en el album
                case 1:
                    System.out.println("\nLISTADO");
                    System.out.println("===============");
                    System.out.println("Seleccione un listado :");
                    System.out.println("1. Listado Completo");
                    System.out.println("2. Listado por autor");
                    System.out.println("3. Listado por genero");
                    System.out.println("4. Listado por rango de duracion");
                    int select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            for (int j = 0; j < album.length; j++) {
                                if (!album[j].getCodigo().equals("LIBRE")) {
                                    System.out.println(album[j]);
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Digite el nombre del autor a listar: ");
                            String autor2 = scanner.next();
                            for (int j = 0; j < album.length; j++) {
                                if (!album[j].getCodigo().equals("LIBRE")) {
                                    if (album[j].getAutor().equals(autor2)) {
                                        System.out.println(album[j]);
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Digite el nombre del genero a listar: ");
                            String genero = scanner.next();
                            for (int j = 0; j < album.length; j++) {
                                if (!album[j].getCodigo().equals("LIBRE")){
                                    if(album[j].getGenero().equals(genero)) {
                                        System.out.println(album[j]);
                                    }
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Digite los rangos de los discos a listar: ");
                            System.out.println("Digite el menor valor de duracion: ");
                            int valor1 = scanner.nextInt();
                            System.out.println("Digite el mayor valor de duracion: ");
                            int valor2 = scanner.nextInt();
                            for (int j = 0; j < album.length; j++) {
                                if (!album[j].getCodigo().equals("LIBRE") &&
                                        (album[j].getDuracion() >= valor1 && album[j].getDuracion() <= valor2)) {
                                    System.out.println(album[j]);
                                }
                            }
                            break;
                    }
                    break;
                //Opcion añadir disco al album
                case 2:
                    for (int j = 0; j <= album.length; j++) {
                        if (album.length >= j) {
                            if (album[j].getCodigo() == "LIBRE") {
                                System.out.println("Añadir nuevo disco: ");

                            /*System.out.println("Ingrese el codigo del disco");
                            codigoIntroducido = scanner.next();*/
                                album[j].setCodigo(String.valueOf(j));

                                System.out.println("Ingrese el nombre del autor del disco");
                                autorIntroducido = scanner.next();
                                album[j].setAutor(autorIntroducido);

                                System.out.println("Ingrese el titulo del disco");
                                tituloIntroducido = scanner.next();
                                album[j].setTitulo(tituloIntroducido);

                                System.out.println("Ingrese el genero del disco");
                                generoIntroducido = scanner.next();
                                album[j].setGenero(generoIntroducido);

                                System.out.println("Ingrese la duracion del disco");
                                duracionIntroducida = scanner.nextInt();
                                album[j].setDuracion(duracionIntroducida);
                                break;
                            }
                        } else {
                            System.out.println("No se permite añadir un nuevo disco hasta que otro sea borrado");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Modificar Disco: ");
                    System.out.println("Ingrese el codigo del disco a modificar: ");
                    String seleccion = scanner.next();
                    for (int j = 0; j <= album.length; j++) {
                        if (seleccion.equals(album[j].getCodigo())) {
                            /*System.out.println("Ingrese el codigo del disco");
                            codigoIntroducido = scanner.next();
                            album[j].setCodigo(codigoIntroducido);*/

                            System.out.println("Ingrese el nombre del autor del disco");
                            autorIntroducido = scanner.next();
                            album[j].setAutor(autorIntroducido);

                            System.out.println("Ingrese el titulo del disco");
                            tituloIntroducido = scanner.next();
                            album[j].setTitulo(tituloIntroducido);

                            System.out.println("Ingrese el genero del album");
                            generoIntroducido = scanner.next();
                            album[j].setGenero(generoIntroducido);

                            System.out.println("Ingrese la duracion del disco");
                            duracionIntroducida = scanner.nextInt();
                            album[j].setDuracion(duracionIntroducida);
                            break;
                        } else {
                            System.out.println("El disco con el codigo: " + seleccion + " No existe");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Eliminar disco del album");
                    System.out.println("Ingrese el codigo del album a eliminar");
                    String seleccion2 = scanner.next();
                    for (int j = 0; j <= album.length; j++) {
                        if (seleccion2.equals(album[j].getCodigo())) {
                            album[j].setCodigo("LIBRE");
                            album[j].setGenero("");
                            album[j].setAutor("");
                            album[j].setTitulo("");
                            album[j].setDuracion(-1);
                            break;
                        } else {
                            System.out.println("El disco con el codigo: " + seleccion2 + " No existe");
                            break;
                        }
                    }
                    break;
            }
        }
        while (opcion != 5);
    }
}

