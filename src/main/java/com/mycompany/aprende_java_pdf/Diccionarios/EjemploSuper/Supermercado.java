package com.mycompany.aprende_java_pdf.Diccionarios.EjemploSuper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Supermercado {
    /**
     * Un supermercado de productos ecológicos nos ha pedido hacer un programa
     * para vender su mercancía. En esta primera versión del programa se tendrán
     * en cuenta los productos que se indican en la tabla junto con su precio. Los
     * productos se venden en bote, brick, etc. Cuando se realiza la compra, hay que
     * indicar el producto y el número de unidades que se compran, por ejemplo
     * “guisantes” si se quiere comprar un bote de guisantes y la cantidad, por
     * ejemplo “3” si se quieren comprar 3 botes. La compra se termina con la palabra
     * “fin. Suponemos que el usuario no va a intentar comprar un producto que
     * no existe. Utiliza un diccionario para almacenar los nombres y precios de los
     * productos y una o varias listas para almacenar la compra que realiza el usuario.
     * A continuación se muestra una tabla con los productos disponibles y sus
     * respectivos precios:
     * avena 2,21
     * garbanzos 2,39
     * tomate 1,59
     * jengibre 3,13
     * quinoa 4,50
     * guisante 1,60
     */

    public static void main(String[] args) {
        HashMap<String,Double> productos = new HashMap<>();
        productos.put("avena",2.21);
        productos.put("garbanzos",2.39);
        productos.put("tomate",1.59);
        productos.put("jengibre",3.13);
        productos.put("quinoa",4.50);
        productos.put("guisantes",1.60);

        Scanner scanner = new Scanner(System.in);
        String seleccion = "";
        double total = 0;
        ArrayList<Producto> lista = new ArrayList<>();
        lista.add(new Producto("avena",2.21));
        lista.add(new Producto("garbanzos",2.39));
        lista.add(new Producto("tomate",1.59));
        lista.add(new Producto("jengibre",3.13));
        lista.add(new Producto("quinoa",4.50));
        lista.add(new Producto("guisantes",1.60));

        while (!seleccion.equals("fin")){
            System.out.println("Producto: ");
            seleccion = scanner.next();
            /*if (seleccion == "fin") {
                break;
            }*/
            Producto p1 = new Producto();
            if (productos.containsKey(seleccion)){
                p1.setNombre(seleccion);
                System.out.println("Cantidad: ");
                p1.setCantidad(scanner.nextInt());
                for (int i = 0; i < lista.size(); i++) {
                    if (p1.getNombre().equals(lista.get(i).getNombre())){
                        lista.get(i).setCantidad(lista.get(i).getCantidad() + p1.getCantidad() );
                    }
                }
            }
        }
        for (int i = 0; i < lista.size() ; i++) {
            lista.get(i).setSubTotal(lista.get(i).getPrecio() * lista.get(i).getCantidad());
        }
        System.out.printf("%-8s %-2s %-8s %-8s\n", "Producto" , "Precio", "Cantidad", "Subtotal");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCantidad() > 0) {
                System.out.printf("%-8s %7.2f %6d %7.2f\n", lista.get(i).getNombre(), lista.get(i).getPrecio(),
                        lista.get(i).getCantidad(), lista.get(i).getSubTotal());
                total += lista.get(i).getSubTotal();
            }
        }
        System.out.printf("%-10s %-4.2f \n", "TOTAL" , total);

    }
}
