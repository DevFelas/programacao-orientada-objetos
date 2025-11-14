package exercicios.lista01;
import java.util.Scanner;

/**Escreva um aplicativo que aceita como entrada um inteiro positivo e
 determine se este é um número perfeito. Um número inteiro é perfeito se
 é igual à soma de seus divisores próprios. Divisores próprios de um

 número positivo N são todos os divisores inteiros positivos de N exceto o
 próprio N. Por exemplo, o número 6, tem divisores próprios 1, 2 e 3, cuja
 soma é igual à 6, ou seja, 1 + 2 + 3 = 6. Logo 6 é um número perfeito.*/

public class ex04 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int somaDivisores = 0;

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        for ( int i = 1 ; i < numero ; i++) {

            if (numero % i == 0) {
                somaDivisores += i;
            }

        }

        if (numero == somaDivisores) {
            System.out.println(numero + " é um número perfeito!");
        }
        else {
            System.out.println(numero + " NÃO é um número perfeito!");
        }

    }
}
