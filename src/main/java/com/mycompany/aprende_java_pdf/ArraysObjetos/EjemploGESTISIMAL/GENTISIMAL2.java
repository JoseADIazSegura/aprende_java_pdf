package com.mycompany.aprende_java_pdf.ArraysObjetos.EjemploGESTISIMAL;

import java.util.ArrayList;
import java.util.Scanner;

public class GENTISIMAL2 {
    /**
     * Modifica el programa Gestisimal realizado anteriormente añadiendo las siguientes
     * mejoras:
     * <p>
     * • Utiliza una lista en lugar de un array para el almacenamiento de los datos.
     * • Comprueba la existencia del código en el alta, la baja y la modificación de
     * artículos para evitar errores.
     * • Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permitirá
     * hacer una venta de varios artículos y emitir la factura correspondiente.
     * Se debe preguntar por los códigos y las cantidades de cada artículo que
     * se quiere comprar. Aplica un 21% de IVA.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Articulo> almacen = new ArrayList<>();

        int seleccion = 0;
        do {
            System.out.println("1.Listado");
            System.out.println("2.Alta");
            System.out.println("3.Baja");
            System.out.println("4.Modificación");
            System.out.println("5.Entrada de mercancia");
            System.out.println("6.Vender");
            System.out.println("7.Salir");
            System.out.println("Seleccione una opcion: ");
            seleccion = scanner.nextInt();
            switch (seleccion) {
                case 1:
                    for (Articulo ar : almacen){
                    System.out.println(ar.toString());
                    }
                    break;
                case 2:
                    for (int i = 0; i < almacen.size(); i++) {
                        if (almacen.get(i).getCodigo() != i) {
                            Articulo ar = new Articulo();
                            ar.setCodigo(i);
                            System.out.println("Ingrese la descripcion del producto");
                            String descrip = scanner.next();
                            ar.setDescripcion(descrip);
                            System.out.println("Ingrese el precio de compra del producto");
                            int precioCompra = scanner.nextInt();
                            ar.setPrecioCompra(precioCompra);
                            System.out.println("Ingrese el precio de venta del producto");
                            int precioVenta = scanner.nextInt();
                            ar.setPrecioVenta(precioVenta);
                            System.out.println("Ingrese el stock del producto");
                            int stock = scanner.nextInt();
                            ar.setStock(stock);
                            almacen.add(ar);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el codigo del producto a eliminar");
                    int cod = scanner.nextInt();
                    for (int i = 0; i < almacen.size(); i++) {
                        if (almacen.get(i).getCodigo() == cod) {
                            almacen.remove(i);
                        }
                        break;
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el codigo del producto a Modificar");
                    int cod1 = scanner.nextInt();
                    for (int i = 0; i < almacen.size(); i++) {
                        if (almacen.get(i).getCodigo() == cod1) {
                            System.out.println("Ingrese la descripcion del producto");
                            String descrip = scanner.next();
                            almacen.get(i).setDescripcion(descrip);
                            System.out.println("Ingrese el precio de compra del producto");
                            int precioCompra = scanner.nextInt();
                            almacen.get(i).setPrecioCompra(precioCompra);
                            System.out.println("Ingrese el precio de venta del producto");
                            int precioVenta = scanner.nextInt();
                            almacen.get(i).setPrecioVenta(precioVenta);
                            System.out.println("Ingrese el stock del producto");
                            int stock = scanner.nextInt();
                            almacen.get(i).setStock(stock);
                            break;
                        }
                        break;
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el codigo del producto a Ingresar Stock");
                    int cod2 = scanner.nextInt();
                    for (int i = 0; i < almacen.size(); i++) {
                        if (almacen.get(i).getCodigo() == cod2) {
                            System.out.println("Ingrese el stock del producto");
                            int stock = scanner.nextInt();
                            almacen.get(i).setStock(almacen.get(i).getStock() + stock);
                            break;
                        }
                        break;
                    }
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad de productos a Vender");
                    int cant = scanner.nextInt();
                    while (cant != 0) {
                        System.out.println("Ingrese el codigo del producto a Vender");
                        int cod3 = scanner.nextInt();

                        for (int i = 0; i < almacen.size(); i++) {
                            if (almacen.get(i).getCodigo() == cod3) {
                                System.out.println("Ingrese el stock a sacar del producto");
                                int stock = scanner.nextInt();
                                if (stock > almacen.get(i).getStock()) {
                                    System.out.println("No hay suficiente stock el producto solicitado");
                                    break;
                                } else {
                                    almacen.get(i).setStock(almacen.get(i).getStock() - stock);
                                    break;
                                }
                            }
                            break;
                        }
                        cant--;
                    }
                    break;
            }
        } while (seleccion != 7);
    }
}

