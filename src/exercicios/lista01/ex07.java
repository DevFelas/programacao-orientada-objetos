package exercicios.lista01;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 7. Um número a é dito permutação de um número b se os dígitos de a
 * formam uma permutação dos dígitos de b. Faça um programa que lê dois
 * inteiros positivos a e b e responda se a é permutação de b.
 * Obs.: Considere que o dígito 0 (zero) não aparece nos números.
 * Exemplo: 5412434 é uma permutação de 4321445, mas não é uma
 * permutação de 4312455.*/

public class ex07 {

    static boolean ehpermutacao (int a, int b) {

        int[] ContA = new int[10];
        int[] ContB = new int[10];

        if (a == b) {
            return true;
        }

        int tempA = a;
        while (tempA > 0) {

            int digito = tempA % 10;

            if (digito == 0) {
                return false;
            }

            ContA[digito]++;
            tempA /= 10;

        }

        int tempB = b;
        while (tempB > 0) {

            int digito = tempB % 10;

            if (digito == 0) {
                return false;
            }

            ContB[digito]++;
            tempB /= 10;

        }

        return Arrays.equals(ContA, ContB);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = input.nextInt();

        if (ehpermutacao(num1, num2)) {
            System.out.println(num1 + " e " + num2 + " são permutações!");
        }
        else {
            System.out.println(num1 + " e " + num2 + " NÃO são permutações!");
        }

    }
}
