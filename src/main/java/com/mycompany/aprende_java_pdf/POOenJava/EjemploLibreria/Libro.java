package com.mycompany.aprende_java_pdf.POOenJava.EjemploLibreria;

public class Libro extends Publicacion implements Prestable{

    private boolean prestado;
    private String estado;

    public Libro(){}
    public Libro(String isbn, String titulo, int año){
        this.setIsbn(isbn);
        this.setTitulo(titulo);
        this.setAño(año);
        this.setPrestado(false);
        this.estado = " (no prestado)";
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }


    @Override
    public void presta() {
        this.setPrestado(true);
        this.estado = " (prestado)";
    }

    @Override
    public void devuelve() {
        this.setPrestado(false);
        this.estado = " (no prestado)";
    }

    @Override
    public boolean estaPrestado() {
        return this.isPrestado();
    }

    public String toString(){
        return "ISBN: "+ this.getIsbn()+", titulo: "+ this.getTitulo() + ", año de publicacion: "+this.getAño() +
                this.estado;
    }
}
