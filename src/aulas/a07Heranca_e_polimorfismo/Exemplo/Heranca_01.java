package aulas.a07Heranca_e_polimorfismo.Exemplo;

public class Heranca_01 {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.nome = "Rex";

        System.out.println("Nome: " + dog.nome);
        dog.emitirSom();
        dog.abanarRabo();
    }

}
