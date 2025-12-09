package aulas.a07Heranca_e_polimorfismo.Empresa;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularBonus() {
        return salario * 0.20;
    }
}
