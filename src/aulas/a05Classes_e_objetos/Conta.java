package aulas.a05Classes_e_objetos;

public class Conta {
        String titular;
        double saldo;

        //Construtor 1
        public Conta (String titular) {
            this.titular = titular;
            this.saldo = 0.0;
        }

        public Conta (String titular, double saldoInicial) {
            this.titular = titular;
            this.saldo = saldoInicial;
        }

        void exibirSaldo () {
            System.out.println(titular + "possui saldo: R$" + saldo);
        }
}