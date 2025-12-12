package exercicios.lista03.ex05;

public class PratoQuente extends ItemMenu {

    public PratoQuente(String nome, float valorBase) {
        this.nome = nome;
        this.valorBase = valorBase;
    }

    @Override
    public double calcularPreco(float valorBase) {
        return valorBase + (valorBase * 12 / 100);
    }

}
