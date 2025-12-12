package exercicios.lista03.ex06;

public class Main {

    public static void main(String[] args) {

        Passagem p1 = new Economica(50);
        Passagem p2 = new Executiva(100);
        Passagem p3 = new PrimeiraClasse(250);

        float valorTotal = p1.calcularPrecoFinal() + p2.calcularPrecoFinal() + p3.calcularPrecoFinal();

        System.out.println("Valor total: " + valorTotal);

    }

}
