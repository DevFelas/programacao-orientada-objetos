package aulas.a06Encapsulamento.br.empresa.servico;

import aulas.a06Encapsulamento.br.empresa.modelo.Funcionario;

public class FolhaPagamento {

    public void calcularSalario(Funcionario f) {
        // Acesso permitido apenas a métodos públicos
        System.out.println("Calculando salário de " + f.getNome());
        System.out.println("Salário atual: " + f.getSalario());

        //❌ f.exibirDados(); //Erro! Método é 'protected' e está em outro pacote.
    }
}
