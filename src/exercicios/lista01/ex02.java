package exercicios.lista01;
import java.util.Scanner;

/**Escreva um aplicativo em Java que solicite ao usuário inserir o tamanho
 do lado de um quadrado e então exiba um quadrado vazio desse tamanho
 feito de asteriscos.
 Seu programa deve trabalhar com quadrados de todos os comprimentos
 de lado possíveis entre 1 e 20.
 Caso o usuário escolha um tamanho inválido, uma mensagem de erro
 deve ser exibida.
 */

public class ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 0;

        System.out.print("Digite um número de 1 a 20: ");
        numero = input.nextInt();

        while (numero < 1 || numero > 20) {
            System.out.println("Número inválido!!");
            System.out.print("Digite um número de 1 a 20: ");
            numero = input.nextInt();
        }

        for (int i = 0 ; i < numero ; i++) {

            for (int j = 0 ; j < numero ; j++ ) {

                if ( i == 0 || i == numero - 1 || j == 0 || j == numero - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println("");
        }
    }
}
