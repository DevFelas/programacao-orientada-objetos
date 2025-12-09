package exercicios.lista03.ex03;

abstract class Entrega {

    protected double distanciaKm;

    public Entrega(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public abstract double calcularValor();

}
