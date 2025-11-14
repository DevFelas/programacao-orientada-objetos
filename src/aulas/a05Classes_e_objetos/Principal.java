package aulas.a05Classes_e_objetos;

public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta("Ana");
        Conta c2 = new Conta("Marcos", 500.0);
        c1.exibirSaldo();
        c2.exibirSaldo();
    }
}
