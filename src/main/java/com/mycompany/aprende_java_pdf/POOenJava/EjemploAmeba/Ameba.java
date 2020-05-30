package com.mycompany.aprende_java_pdf.POOenJava.EjemploAmeba;

public class Ameba {
    //Atributos de la clase Ameba
    private int peso;

    //Constructores de la clase
    public Ameba(){this.peso = 3;}
    public Ameba(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //Metodos de la clase Ameba
    public void come(int comida){
        this.peso--;
        this.peso += comida;
    }

    public void come(Ameba comida){
        this.peso--;
        this.peso += comida.getPeso();
        comida.setPeso(0);
    }

    public String toString() {
        return "Soy una ameba y peso " + this.peso + " microgramos";
    }
}
