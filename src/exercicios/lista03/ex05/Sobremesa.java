package exercicios.lista03.ex05;

public class Sobremesa extends ItemMenu{

    public Sobremesa(String nome, float valorBase) {
        this.nome = nome;
        this.valorBase = valorBase;
    }

    @Override
    public double calcularPreco(float valorBase) {
        return valorBase + (valorBase * 5 / 100);
    }

}
