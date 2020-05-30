package com.mycompany.aprende_java_pdf.POOenJava.EjemploTiempo;

public class Tiempo {

    //Atributos de la clase TIempo
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public Tiempo sumar(Tiempo tiempo1, Tiempo tiempo2){
        Tiempo resultado = new Tiempo(0,0,0);
        resultado.segundos += tiempo1.getSegundos();
        resultado.segundos += tiempo2.getSegundos();
        if (resultado.segundos >= 60){
            resultado.minutos++;
            resultado.segundos = resultado.segundos - 60;
        }
        resultado.minutos += tiempo1.getMinutos();
        resultado.minutos += tiempo2.getMinutos();
        if (resultado.minutos >= 60){
            resultado.horas++;
            resultado.minutos = resultado.minutos - 60;
        }
        resultado.horas += tiempo1.getHoras();
        resultado.horas += tiempo2.getHoras();

        return resultado;
    }

    public String toString() {
        return "EL tiempo es: " + this.horas + "h " + this.minutos + "m " + this.segundos+ "s ";
    }
}
