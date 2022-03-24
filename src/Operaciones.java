

/**
 *
 * @author javie
 */
public class Operaciones {
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
         if(Divisa == 0 && DivisaFinal == 1){ //Dolares a euros
          Resultado = valor * 0.85;   
         }
         return Resultado;
     }
}

