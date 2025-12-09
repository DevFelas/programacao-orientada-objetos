package exercicios.lista03.ex03;

public class EntregaAgendada extends Entrega{

    public EntregaAgendada(double distanciaKm) {
        super(distanciaKm);
    }

    @Override
    public double calcularValor(){
        return (3.0 * distanciaKm) + 10;
    }

}
