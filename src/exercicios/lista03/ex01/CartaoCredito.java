package exercicios.lista03.ex01;

public class CartaoCredito extends Pagamento{

    @Override
    public void processar() {
        System.out.println("Pagamento feito com Cartão de Crédito!");
    }
}
