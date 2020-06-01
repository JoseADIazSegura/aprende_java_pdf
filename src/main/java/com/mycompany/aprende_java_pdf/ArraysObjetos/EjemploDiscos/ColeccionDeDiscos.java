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
                    for (int j = 0; j < album.length; j++) {
                        if (!album[j].getCodigo().equals("LIBRE")) {
                            System.out.println(album[j]);
                        }
                    }
                    break;
                //Opcion añadir disco al album
                case 2:
                    for (int j = 0; j <= album.length; j++) {
                        if (album.length >= j ) {
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

