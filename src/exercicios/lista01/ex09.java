package exercicios.lista01;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 9. Escreva uma classe em java que receba um vetor com 10 valores inteiros
 * e ordene os mesmo em ordem crescente.*/

public class ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int TAMANHO = 10;
        int[] vetor = new int[TAMANHO];

        System.out.println("Por favor, digite 10 valores");

        for ( int i = 0 ; i < TAMANHO ; i++) {
            System.out.println("Digite o " + (i + 1) + " valor: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("Vetor original: " + Arrays.toString(vetor));

        Arrays.sort(vetor);

        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

    }

}