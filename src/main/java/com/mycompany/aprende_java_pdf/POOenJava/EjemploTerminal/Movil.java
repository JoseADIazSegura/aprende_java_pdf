package com.mycompany.aprende_java_pdf.POOenJava.EjemploTerminal;

import java.text.DecimalFormat;

public class Movil extends Terminal {
    //Atributos de la clase Movil
    private String tarifa;
    private Double cobro;

    public Movil(String numero, String tarifa) {
        this.setNumero(numero);
        this.tarifa = tarifa;
        this.cobro = 0.0;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }
    public Double getCobro() {
        return cobro;
    }

    public void setCobro(Double cobro) {
        this.cobro = cobro;
    }

    //Metodos de la aplicacion

    public void llama(Movil t1, int tiempoLlamada) {
        this.setTiempoConversacion(this.getTiempoConversacion() + tiempoLlamada);

    }

    public double tarificar() {
        double tiempo = this.getTiempoConversacion();
        double valorCobrar = 0;
        switch (this.tarifa) {
            case "rata":
                valorCobrar = (tiempo / 60) * 0.06;
                break;
            case "mono":
                valorCobrar = (tiempo / 60) * 0.12;
                break;
            case "bisonte":
                valorCobrar = (tiempo / 60) * 0.30;
                break;
        }
        return valorCobrar;
    }

    public String toString() {
        return "N° " + this.getNumero() + " - " + this.getTiempoConversacion() + "s  de conversación" + " - " +
                "tarificados " + String.format("%.2f", this.tarificar()) + " Euros";
    }
}
