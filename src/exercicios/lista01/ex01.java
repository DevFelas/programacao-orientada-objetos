package exercicios.lista01;
import java.util.Scanner;

/** <b>Aquecimento</b> - Ler três valores: A, B e C e dizer se estes valores podem
 * ser os lados de um triângulo.
 * Dica: a + b > c e a + c > b e b + c > a.
 * Caso os valores formem um triângulo, informar se o triângulo é equilátero
 * (os três lados iguais), isósceles (2 lados iguais) ou escalenos (três lados
 * diferentes).
 */

public class ex01 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int a = 0, b = 0, c = 0;

        System.out.println("Digite 3 valores: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.print("É possível fazer um triângulo ");
            if (a == b && b == c) {
                System.out.print("Equilátero");
            }
            else if (a == b || a == c || b == c) {
                System.out.print("Isórceles");
            }
            else {
                System.out.print("Escaleno");
            }

            System.out.printf(" com os valores %d, %d e %d", a, b, c);
        } else {

            System.out.printf("Não é possível fazer um triangulo com os valores %d, %d e %d", a, b, c);

        }
        
    }

}
