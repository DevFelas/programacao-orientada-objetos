package exercicios.lista03.ex03;

public class Main {

    public static void main(String[] args) {

        Entrega e1 = new EntregaNormal(10);
        Entrega e2 = new EntregaAgendada(10);
        Entrega e3 = new EntregaExpressa(10);

        System.out.println("Entrega normal: " + e1.calcularValor());
        System.out.println("Entrega agendada: " + e2.calcularValor());
        System.out.println("Entrega expressa: " + e3.calcularValor());

    }

}
