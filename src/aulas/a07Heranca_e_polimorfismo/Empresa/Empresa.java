package aulas.a07Heranca_e_polimorfismo.Empresa;

public class Empresa {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("João", 3000);
        Gerente g = new Gerente("Maria", 8000);
        Estagiario e = new Estagiario("Pedro", 1200);

        System.out.println(f.nome + " Bônus: " + f.calcularBonus());
        System.out.println(g.nome + " Bônus: " + g.calcularBonus());
        System.out.println(e.nome + " Bônus: " + e.calcularBonus());
    }

}
