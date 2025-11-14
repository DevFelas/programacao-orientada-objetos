package exercicios.lista01;

import java.util.Scanner;

/**
 * 10.Escreva uma casse em java que verifique se um vetor de caracteres é um
 * palíndromo.
 * Ex: AXYXA*/

public class ex10 {

    static boolean ehpalindromo (char[] vetor) {
        if ( vetor == null ) {
            return true;
        }

        int inicio = 0;
        int fim = vetor.length - 1;

        while ( inicio < fim ) {
            if ( vetor[inicio] != vetor[fim]) {
                return false;
            }

            inicio++;
            fim--;
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = input.nextLine();

        char[] vetorChar = palavra.toCharArray();

        if (ehpalindromo(vetorChar)) {
            System.out.println(palavra + " é um palindromo!");
        }
        else {
            System.out.println(palavra + " NÃO é um palindromo!");
        }
    }
}
