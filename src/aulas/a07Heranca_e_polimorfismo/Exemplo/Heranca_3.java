package aulas.a07Heranca_e_polimorfismo.Exemplo;

public class Heranca_3 {

    public static void main(String[] args) {
        Animal a = new Animal();
        Cavalo c = new Cavalo();
        Animal animal = new Cavalo();

        animal.emitirSom();
        a.emitirSom();
        c.emitirSom();
    }

}
