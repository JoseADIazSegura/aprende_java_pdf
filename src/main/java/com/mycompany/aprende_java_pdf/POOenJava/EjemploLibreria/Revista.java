package com.mycompany.aprende_java_pdf.POOenJava.EjemploLibreria;

public class Revista extends Publicacion{

    private int numero;
    public Revista(){}
    public Revista(String isbn,String titulo,int año,int numero){
        this.setIsbn(isbn);
        this.setTitulo(titulo);
        this.setAño(año);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString(){
        return "ISBN: "+ this.getIsbn()+", titulo: "+ this.getTitulo() + ", año de publicacion: "+this.getAño() +
                ", revista numero : " + this.getNumero();
    }
}
