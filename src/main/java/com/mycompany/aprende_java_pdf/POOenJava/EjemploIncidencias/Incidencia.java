package com.mycompany.aprende_java_pdf.POOenJava.EjemploIncidencias;

public class Incidencia {


    //Atributos de la clase Incidencia
    private int numIncidencia;
    private int numeroPuesto;
    private String incidencia;
    private String estado;
    private String solucionIncidencia;
    private static int numIncidencias = 0;
    private static int incidenciasPendientes = 0;

    //Constructores de la clase Incidencia
    public Incidencia(){}
    public Incidencia(int numeroPuesto, String incidencia){
        setNumIncidencias(getNumIncidencias()+ 1);
        setIncidenciasPendientes(getIncidenciasPendientes() + 1);
        this.numIncidencia = getNumIncidencias();
        this.numeroPuesto = numeroPuesto;
        this.incidencia = incidencia;
        this.estado = "Pendiente";
        this.solucionIncidencia = "";
    }

    //Encapsulamiento de la clase Incidencia
    public int getNumIncidencia() {
        return numIncidencia;
    }

    public void setNumIncidencia(int numIncidencia) {
        this.numIncidencia = numIncidencia;
    }

    public int getNumeroPuesto() {
        return numeroPuesto;
    }

    public void setNumeroPuesto(int numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }

    public String getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }

    public String getSolucionIncidencia() {
        return solucionIncidencia;
    }

    public void setSolucionIncidencia(String solucionIncidencia) {
        this.solucionIncidencia = solucionIncidencia;
    }

    public static int getNumIncidencias() {
        return numIncidencias;
    }

    public static void setNumIncidencias(int numIncidencias) {
        Incidencia.numIncidencias = numIncidencias;
    }

    public static int getIncidenciasPendientes() {
        return incidenciasPendientes;
    }

    public static void setIncidenciasPendientes(int incidenciasPendientes) {
        Incidencia.incidenciasPendientes = incidenciasPendientes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Metodos de la clase Incidencia

    public void resuelve(String solucion){
        this.estado = "Resuelta";
        this.solucionIncidencia = solucion;
        setIncidenciasPendientes(getIncidenciasPendientes() - 1);
    }

    public String toString(){
        String resultado;
       if (this.getEstado()== "Pendiente"){
           resultado = "Incidencia "+ this.getNumIncidencia() +" - Puesto: " + this.getNumeroPuesto() + " - "
                   + this.getIncidencia() + " - " + this.getEstado();
       }else{
           resultado = "Incidencia "+ this.getNumIncidencia() +" - Puesto: " + this.getNumeroPuesto() + " - "
                   + this.getIncidencia() + " - " + this.getEstado() + " - " + this.getSolucionIncidencia();
       }
       return resultado;
    }
}
