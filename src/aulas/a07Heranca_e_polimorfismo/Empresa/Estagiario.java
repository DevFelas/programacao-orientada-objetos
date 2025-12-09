package aulas.a07Heranca_e_polimorfismo.Empresa;

public class Estagiario extends Funcionario{
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return 200;
    }
}
