package exercicios.lista02.ex01;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        conta1.setTitular("Maria");
        conta1.depositar(100);

        conta2.setTitular("Luis");
        conta2.depositar(200);

        conta1.sacar(1000);
        conta2.sacar(50);

        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: " + conta1.getSaldo());

        System.out.println("Titular: " + conta2.getTitular());
        System.out.println("Saldo: " + conta2.getSaldo());
    }
}
