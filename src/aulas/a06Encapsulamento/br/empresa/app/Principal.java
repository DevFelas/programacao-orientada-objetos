package aulas.a06Encapsulamento.br.empresa.app;

import aulas.a06Encapsulamento.br.empresa.modelo.Funcionario;
import aulas.a06Encapsulamento.br.empresa.modelo.Gerente;
import aulas.a06Encapsulamento.br.empresa.servico.FolhaPagamento;

public class Principal {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Lucas", 3000);
        Gerente gerente = new Gerente("Marina", 7000, "TI");

        FolhaPagamento folha = new FolhaPagamento();

        folha.calcularSalario(func);  // acessa métodos públicos

        // Gerente consegue acessar método protegido da classe pai (mesmo em outro pacote)
        gerente.mostrarInfoGerente();
    }
}
