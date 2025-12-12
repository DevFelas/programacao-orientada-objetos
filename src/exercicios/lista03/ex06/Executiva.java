package exercicios.lista03.ex06;

public class Executiva extends Passagem{

    public Executiva(float valor) {
        this.valor = valor;
    }

    public float calcularPrecoFinal() {
        return this.valor + (this.valor * 20 / 100);
    }

}
