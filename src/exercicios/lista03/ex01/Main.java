package exercicios.lista03.ex01;

public class Main {

    public static void main(String[] args) {
        Pix p = new Pix();
        CartaoCredito c = new CartaoCredito();
        Boleto b = new Boleto();

        p.processar();
        c.processar();
        b.processar();
    }

}
