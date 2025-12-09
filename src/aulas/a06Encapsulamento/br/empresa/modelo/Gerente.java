package aulas.a06Encapsulamento.br.empresa.modelo;

public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public void mostrarInfoGerente() {
        // Pode acessar método protegido da super classe
        exibirDados();
        System.out.println("Departamento: " + departamento);
    }
}
