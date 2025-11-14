package exercicios.lista01;

import java.util.Scanner;

/**
 * 11.Em álgebra linear, a diagonal secundária de uma matriz A é a coleção das
 * entradas Aij em que i + j é igual a n + 1 (onde n é a ordem da matriz). A
 * diagonal secundária de uma matriz quadrada une o seu canto inferior
 * esquerdo ao canto superior direito.
 * Escreva um algoritmo Java que declara uma matriz 3x3 e pede ao usuário
 * para informar seus valores. Em seguida mostre todos os valores da matriz
 * e a soma dos elementos da diagonal secundária.*/

public class ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a um valor para a ordem de uma matriz quadrada: ");

        int ordem = input.nextInt();

        int[][] matriz = new int[ordem][ordem];

        System.out.println("Digite os valores da matriz.");

        for ( int i = 0 ; i < ordem ; i++ ) {
            for ( int j = 0; j < ordem ; j++) {
                System.out.printf("Valor [%d][%d]: ", i, j);
                matriz[i][j] = input.nextInt();
            }
        }

        int somaDsecundaria = 0;

        for (int i = 0 ; i < ordem ; i++) {
            for (int j = 0 ; j < ordem ; j++) {
                if ( i + j == ordem - 1) {
                    somaDsecundaria += matriz[i][j];
                    System.out.printf("[%d]\t", matriz[i][j]);
                }
                else {
                    System.out.printf(" %d \t", matriz[i][j]);
                }
            }
            System.out.println();
        }

        System.out.println("Soma da diagonal secundaria: "+somaDsecundaria);

    }
}
