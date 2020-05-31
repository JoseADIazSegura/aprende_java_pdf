package com.mycompany.aprende_java_pdf.POOenJava.EjemploCuentaCorriente;
import java.util.Random;

public class CuentaCorriente {
    private String numeroCuenta = "";
    private double saldo;
    Random rdn = new Random();

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(){
        generaNumero();
        this.saldo = 0;
    }
    public CuentaCorriente(double saldo){
        generaNumero();
        this.saldo = saldo;
    }

    //Metodos de la clase Cuenta

    public void ingreso(double cantidad){
        this.setSaldo(this.getSaldo() + cantidad);
    }

    public void cargo(double cantidad){
        this.setSaldo(this.getSaldo() - cantidad);
    }
    public void transferencia(CuentaCorriente c1, double cantidad){
        this.setSaldo(this.getSaldo() - cantidad);
        c1.setSaldo(c1.getSaldo() + cantidad);
    }

    private void generaNumero() {
        for (int i = 0; i < 10; i++) {
            this.numeroCuenta += (int) (Math.random() * 10);
        }
    }

    public String toString(){
        return "Numero de cta: " + this.numeroCuenta + " Saldo: $" + String.format("%.2f",this.getSaldo());
    }

}
