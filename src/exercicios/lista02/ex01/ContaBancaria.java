package exercicios.lista02.ex01;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria () {
        this.titular = " ";
        this.saldo = 0.0;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar (double valor) {
        this.saldo += valor;
    }

    public void sacar (double valor) {
        if ( valor > this.saldo) {
            System.out.println("Saldo insuficiente!");
        }
        else {
            this.saldo -= valor;
        }
    }
}
