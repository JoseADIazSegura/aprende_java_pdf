package com.mycompany.aprende_java_pdf.ArraysObjetos.EjemploGESTISIMAL;

import com.mycompany.aprende_java_pdf.ArraysObjetos.EjemploDiscos.Disco;

import java.util.Scanner;

public class PruebaGENTISIMAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el stock maximo de productos para el almacen: ");
        Articulo[] almacen = new Articulo[scanner.nextInt()];
        for (int i = 0; i < almacen.length; i++) {
            almacen[i] = new Articulo();
        }



        int seleccion = 0;
        do{
            System.out.println("1.Listado");
            System.out.println("2.Alta");
            System.out.println("3.Baja");
            System.out.println("4.Modificación");
            System.out.println("5.Entrada de mercancia");
            System.out.println("6.Salida de mercancia");
            System.out.println("7.Salir");
            System.out.println("Seleccione una opcion: ");
            seleccion = scanner.nextInt();
            switch (seleccion){
                case 1:
                    for (int i = 0; i < almacen.length; i++) {
                        if (almacen[i].getCodigo() != -1){
                            System.out.println(almacen[i]);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < almacen.length; i++) {
                        if (almacen[i].getCodigo() == -1){
                            almacen[i].setCodigo(i);
                            System.out.println("Ingrese la descripcion del producto");
                            String descrip = scanner.next();
                            almacen[i].setDescripcion(descrip);
                            System.out.println("Ingrese el precio de compra del producto");
                            int precioCompra = scanner.nextInt();
                            almacen[i].setPrecioCompra(precioCompra);
                            System.out.println("Ingrese el precio de venta del producto");
                            int precioVenta = scanner.nextInt();
                            almacen[i].setPrecioVenta(precioVenta);
                            System.out.println("Ingrese el stock del producto");
                            int stock = scanner.nextInt();
                            almacen[i].setStock(stock);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el codigo del producto a eliminar");
                    int cod = scanner.nextInt();
                    for (int i = 0; i < almacen.length; i++) {
                        if (almacen[i].getCodigo() == cod){
                            almacen[i].setCodigo(-1);
                            almacen[i].setDescripcion("");
                            almacen[i].setPrecioVenta(0);
                            almacen[i].setPrecioCompra(0);
                            almacen[i].setStock(0);
                        }
                        break;
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el codigo del producto a Modificar");
                    int cod1 = scanner.nextInt();
                    for (int i = 0; i < almacen.length; i++) {
                        if (almacen[i].getCodigo() == cod1){
                            System.out.println("Ingrese la descripcion del producto");
                            String descrip = scanner.next();
                            almacen[i].setDescripcion(descrip);
                            System.out.println("Ingrese el precio de compra del producto");
                            int precioCompra = scanner.nextInt();
                            almacen[i].setPrecioCompra(precioCompra);
                            System.out.println("Ingrese el precio de venta del producto");
                            int precioVenta = scanner.nextInt();
                            almacen[i].setPrecioVenta(precioVenta);
                            System.out.println("Ingrese el stock del producto");
                            int stock = scanner.nextInt();
                            almacen[i].setStock(stock);
                            break;
                        }
                        break;
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el codigo del producto a Ingresar Stock");
                    int cod2 = scanner.nextInt();
                    for (int i = 0; i < almacen.length; i++) {
                        if (almacen[i].getCodigo() == cod2) {
                            System.out.println("Ingrese el stock del producto");
                            int stock = scanner.nextInt();
                            almacen[i].setStock(almacen[i].getStock() + stock);
                            break;
                        }
                        break;
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el codigo del producto a Sacar Stock");
                    int cod3 = scanner.nextInt();
                    for (int i = 0; i < almacen.length; i++) {
                        if (almacen[i].getCodigo() == cod3) {
                            System.out.println("Ingrese el stock a sacar del producto");
                            int stock = scanner.nextInt();
                            if (stock > almacen[i].getStock()){
                                System.out.println("No hay suficiente stock el producto solicitado");
                                break;
                            }else{
                                almacen[i].setStock(almacen[i].getStock() + stock);
                                break;
                            }
                        }
                        break;
                    }
                    break;
            }
        }while (seleccion!=7);
    }
}
