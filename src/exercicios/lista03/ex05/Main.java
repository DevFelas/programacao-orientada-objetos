package exercicios.lista03.ex05;

public class Main {

    public static void main(String[] args) {

        ItemMenu item1 = new PratoQuente("Feijoada", 25);
        ItemMenu item2 = new Bebida("Coca Cola", 9);
        ItemMenu item3 = new Sobremesa("Sorvete", 5);

        ItemMenu carrinho[] = { item1, item2, item3 };

        float valorTotal = 0;

        for ( int i = 0 ; i < 3 ; i++ ) {
            double valorFinal = carrinho[i].calcularPreco(carrinho[i].valorBase);
            System.out.println( "Item: " + carrinho[i].nome + " Preço: " + valorFinal);
            valorTotal += valorFinal;
        }
        System.out.println("valor total: " + valorTotal);

    }
}
