package com.mycompany.aprende_java_pdf.POOenJava.EjemploDomino;

public class FichaDomino {
    private int lado1;
    private int lado2;

    public FichaDomino(){}
    public FichaDomino(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public String voltea(){
        int bandera = this.lado1;
        this.setLado1(this.lado2);
        this.setLado2(bandera);
        return this.toString();
    }
    public boolean encaja(FichaDomino f1){
        if(this.getLado1() == f1.getLado1() || this.getLado1() == f1.getLado2() || this.getLado2() == f1.getLado1()
                || this.getLado2() == f1.getLado2() ){
            return true;
        }else {
            return false;
        }
    }

    public String toString(){
        return "[" + this.getLado1() + "|"+this.getLado2() + "]";
    }

}
