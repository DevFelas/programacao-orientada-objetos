package exercicios.lista03.ex04;

public class Main {

    public static void main(String[] args) {

        Prova a1 = new Prova();
        a1.notaBase = 7;

        Apresentacao a2 = new Apresentacao();
        a2.notaBase = 7;

        Trabalho a3 = new Trabalho();
        a3.notaBase = 7;

        System.out.println("Nota da prova: " + a1.calcularNotaFinal());
        System.out.println("Nota da apresentação: " + a2.calcularNotaFinal());
        System.out.println("Nota do trabalho: " + a3.calcularNotaFinal());

        double mediaFinal = (a1.calcularNotaFinal() + a2.calcularNotaFinal() + a3.calcularNotaFinal()) / 3;

        System.out.printf("Média final: %.1f", mediaFinal);
    }

}
