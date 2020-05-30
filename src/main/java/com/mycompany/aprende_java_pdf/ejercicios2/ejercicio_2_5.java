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
public class ejercicio_2_5 {

  /**
   * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se
   * quiere convertir deberá estar almacenada en una variable.
   */
  public static void main(String[] args) {
    // TODO code application logic here
    double pesetas = 75203.76;
    double tasaConversion = 166.38;
    double euros = pesetas / tasaConversion;
    
    System.out.println(pesetas + " Pesetas equivalen a: "+ euros + " euros.");
  }

}
 
