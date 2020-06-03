package com.mycompany.aprende_java_pdf.ArrayList;

import com.mycompany.aprende_java_pdf.ArraysObjetos.EjemploDiscos.Disco;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
     * una lista para almacenar la información sobre los discos en lugar de un array
     * convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
     * ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
     * programa hecho con una lista?
     */
    public static void main(String[] args) {
        ArrayList<Disco> collecionDiscos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int codigo = 0;

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
                            System.out.println(collecionDiscos);
                            break;
                        case 2:
                            System.out.println("Digite el nombre del autor a listar: ");
                            String autor2 = scanner.next();
                            for (int j = 0; j < collecionDiscos.size(); j++) {
                                if (!collecionDiscos.get(j).getCodigo().equals("LIBRE")) {
                                    if (collecionDiscos.get(j).getAutor().equals(autor2)) {
                                        System.out.println(collecionDiscos.get(j));
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Digite el nombre del genero a listar: ");
                            String genero = scanner.next();
                            for (int j = 0; j < collecionDiscos.size(); j++) {
                                if (!collecionDiscos.get(j).getCodigo().equals("LIBRE")) {
                                    if (collecionDiscos.get(j).getGenero().equals(genero)) {
                                        System.out.println(collecionDiscos.get(j));
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
                            for (int j = 0; j < collecionDiscos.size(); j++) {
                                if (!collecionDiscos.get(j).getCodigo().equals("LIBRE") &&
                                        (collecionDiscos.get(j).getDuracion() >= valor1 && collecionDiscos.get(j).getDuracion() <= valor2)) {
                                    System.out.println(collecionDiscos.get(j));
                                }
                            }
                            break;
                    }
                    break;

                    //Opcion añadir disco al album
                case 2:
                    System.out.println("Añadir nuevo disco: ");
                    Disco test = new Disco();
                            /*System.out.println("Ingrese el codigo del disco");
                            codigoIntroducido = scanner.next();*/

                    test.setCodigo(String.valueOf(codigo));
                    codigo++;

                    System.out.println("Ingrese el nombre del autor del disco");
                    test.setAutor(scanner.next());

                    System.out.println("Ingrese el titulo del disco");
                    test.setTitulo(scanner.next());

                    System.out.println("Ingrese el genero del disco");
                    test.setGenero(scanner.next());

                    System.out.println("Ingrese la duracion del disco");
                    test.setDuracion(scanner.nextInt());

                    collecionDiscos.add(test);
                    break;
                case 3:
                    System.out.println("Modificar Disco: ");
                    System.out.println("Ingrese el codigo del disco a modificar: ");
                    String seleccion = scanner.next();
                    for (int j = 0; j <= collecionDiscos.size(); j++) {
                        if (seleccion.equals(collecionDiscos.get(j).getCodigo())) {

                            System.out.println("Ingrese el nombre del autor del disco");
                            collecionDiscos.get(j).setAutor(scanner.next());

                            System.out.println("Ingrese el titulo del disco");
                            collecionDiscos.get(j).setTitulo(scanner.next());

                            System.out.println("Ingrese el genero del disco");
                            collecionDiscos.get(j).setGenero(scanner.next());

                            System.out.println("Ingrese la duracion del disco");
                            collecionDiscos.get(j).setDuracion(scanner.nextInt());
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
                    for (int j = 0; j <= collecionDiscos.size(); j++) {
                        if (seleccion2.equals(collecionDiscos.get(j).getCodigo())) {
                            collecionDiscos.remove(j);
                            break;
                        } else {
                            System.out.println("El disco con el codigo: " + seleccion2 + " No existe");
                            break;
                        }
                    }
            }
        }while (opcion!=5);
    }
}
