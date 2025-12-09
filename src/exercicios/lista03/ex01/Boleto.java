package exercicios.lista03.ex01;

public class Boleto extends Pagamento{

    @Override
    public void processar() {
        System.out.println("Pagamento feito com Boleto");
    }
}
