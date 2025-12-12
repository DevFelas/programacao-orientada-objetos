package exercicios.lista03.ex06;

public class PrimeiraClasse extends Passagem {

    public PrimeiraClasse(float valor) {
        this.valor = valor;
    }

    public float calcularPrecoFinal() {
        return this.valor + (this.valor * 50 / 100);
    }

}
