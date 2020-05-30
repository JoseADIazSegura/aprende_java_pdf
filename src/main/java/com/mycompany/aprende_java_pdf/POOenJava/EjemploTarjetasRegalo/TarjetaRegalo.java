package com.mycompany.aprende_java_pdf.POOenJava.EjemploTarjetasRegalo;

public class TarjetaRegalo {

    //Atributos de la clase Tarjeta Regalo
    private int numero;
    private double saldo;

    //Constructores de la clase Tarjeta Regalo
    public TarjetaRegalo(){}
    public TarjetaRegalo(double saldo){
        this.numero = (int)(Math.random()*99999+1);
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Metodos de la clase Tarjeta Regalo
    public void gasta(double gasto){
        if(gasto > this.getSaldo()){
            System.out.println("No tiene suficiente saldo para gastar " +"$"+ gasto );
        }else{
            this.setSaldo(this.getSaldo() - gasto);
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t2){
        double saldoSuma = this.getSaldo() + t2.getSaldo();
        this.setSaldo(0);
        t2.setSaldo(0);
        TarjetaRegalo t3 = new TarjetaRegalo(saldoSuma);
        return t3;
    }

    public String toString() {
       return "Tarjeta n° "+ this.getNumero() + " - Saldo $"+String.format("%.2f",this.getSaldo());
    }
}
