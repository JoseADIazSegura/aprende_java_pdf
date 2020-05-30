package com.mycompany.aprende_java_pdf.POOenJava.EjemploLibreria;

public class Publicacion {
    private String isbn;
    private String titulo;
    private int año;

    public Publicacion(){}
    public Publicacion(String isbn, String titulo,int año){
        this.isbn = isbn;
        this.titulo = titulo;
        this.año = año;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
