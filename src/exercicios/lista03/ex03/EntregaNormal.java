package exercicios.lista03.ex03;

public class EntregaNormal extends Entrega{

    public EntregaNormal(double distanciaKm) {
        super(distanciaKm);
    }

    public double calcularValor(){
        return 2.0 * distanciaKm;
    }

}
