package exercicios.lista01;

import java.util.Scanner;

/**
 * 8. Escreva uma classe Estatística em Java que contenha métodos estáticos
 * que recebam um array de inteiros, juntamente com o número de
 * elementos, e calculem respectivamente:
 * a) a moda dos elementos no array (elemento mais freqüente).
 * b) a mediana dos elementos no array(elemento central).
 * c) a média.*/

public class ex08 {

    static float media ( float[] valores ) {
        float soma = 0;
        for ( int i = 0 ; i < valores.length ; i++) {
            soma += valores[i];
        }

        float media = soma / valores.length;
        return media;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



    }
}
