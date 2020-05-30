package com.mycompany.aprende_java_pdf.POOenJava.EjemploTerminal;

public class Terminal {
    //Atributos de la clase Terminal
    private String numero;
    private int tiempoConversacion;

    public String getNumero() {
        return numero;
    }

    //Constructores de la clase Terminal
    public Terminal(){}
    public Terminal(String numero){
        this.numero = numero;
    }
    public Terminal (String numero,int tiempoConversacion){
        this.numero = numero;
        this.tiempoConversacion = tiempoConversacion;
    }

    //Encapsulamiento de los atributos de la clase
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTiempoConversacion() {
        return tiempoConversacion;
    }

    public void setTiempoConversacion(int tiempoConversacion) {
        this.tiempoConversacion = tiempoConversacion;
    }

    //Metodos de la aplicacion
    public void llama(Terminal t1,int tiempoLlamada){
        this.tiempoConversacion += tiempoLlamada;
        t1.setTiempoConversacion(t1.getTiempoConversacion() + tiempoLlamada);
    }

    public String toString() {
        return "N° " + this.numero + " - " + this.tiempoConversacion + "s  de conversación";
    }
}
