package exercicios.lista03.ex03;

public class EntregaExpressa extends Entrega{

    public EntregaExpressa(double distanciaKm) {
        super(distanciaKm);
    }

    public double calcularValor(){
        return 4.0 * distanciaKm;
    }

}
