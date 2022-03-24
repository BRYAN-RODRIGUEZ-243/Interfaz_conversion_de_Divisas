/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor_de_divisas;

/**
 *
 * @author javie
 */
class Operaciones {
    
 private double valor,Resultado;
    private int Divisa,DivisaFinal;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }

    public int getDivisa() {
        return Divisa;
    }

    public void setDivisa(int Divisa) {
        this.Divisa = Divisa;
    }

    public int getDivisaFinal() {
        return DivisaFinal;
    }

    public void setDivisaFinal(int DivisaFinal) {
        this.DivisaFinal = DivisaFinal;
    }
    
    public Operaciones() {
    }
    //Metodos
     public double convertir(){
         if(Divisa == 0 && DivisaFinal == 0){ //Dolares a euros
          Resultado = valor * 0.85;   
         }else if(Divisa == 0 && DivisaFinal == 1){
             Resultado = valor;
         }
         return Resultado;
     }
}
 