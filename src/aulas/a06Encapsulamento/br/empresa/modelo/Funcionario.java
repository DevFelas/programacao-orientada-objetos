package aulas.a06Encapsulamento.br.empresa.modelo;

// Classe pública: pode ser usada em outros pacotes
public class Funcionario {
    // Atributos privados
    private String nome;
    private double salario;

    // Construtor público
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Getter e Setter (encapsulamento)
    public String getNome() {
        return nome;
    }

    public void setSalario() {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public double getSalario() {
        return salario;
    }

    // Método protegido (visível apenas no mesmo pacote e em subclasses)
    protected void exibirDados() {
        System.out.println("Funcionário: " + nome + " - Salário: " + salario);
    }
}
