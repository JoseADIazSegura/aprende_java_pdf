package com.mycompany.aprende_java_pdf.FicherosTexto;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("lorem.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("lorem_sort.txt"));

            String bandera = "";
            ArrayList<String> arreglo = new ArrayList<>();
            while (bandera != null){
                bandera = br.readLine();
                if (bandera != null){arreglo.add(bandera);}
            }
            System.out.println(arreglo);
            arreglo.sort(String::compareTo);
            for (int i = 0; i < arreglo.size() - 1; i++) {
                bw.write(arreglo.get(i) + "\n");
            }
            bw.flush();
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
