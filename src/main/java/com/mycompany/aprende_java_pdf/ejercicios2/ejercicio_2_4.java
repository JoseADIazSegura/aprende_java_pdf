/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aprende_java_pdf.ejercicios2;

/**
 *
 * @author Josex
 */
public class ejercicio_2_4 {

  /**
   * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
   * convertir deberá estar almacenada en una variable.
   */
  public static void main(String[] args) {
    // TODO code application logic here
    double euros = 452;
    double tasaConversion = 166.38;
    double pesetas = euros * tasaConversion;
    
    System.out.println(euros + " Euros equivalen a: "+pesetas + " pesetas.");
  }

}
