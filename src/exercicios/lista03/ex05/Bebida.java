package exercicios.lista03.ex05;

public class Bebida extends ItemMenu{

    public Bebida(String nome, float valorBase) {
        this.nome = nome;
        this.valorBase = valorBase;
    }

    @Override
    public double calcularPreco(float valorBase) {
        return valorBase;
    }

}
