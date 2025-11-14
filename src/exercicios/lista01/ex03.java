package exercicios.lista01;
import java.util.Scanner;

/**Escreva um aplicativo que aceita como entrada um inteiro contendo
 somente 0s e 1s (isto é, um inteiro binário) e imprime seu equivalente
 decimal.
 Caso o usuário digite um número com dígitos diferentes de 0s e 1s, uma
 mensagem de erro deve ser exibida.
 Dica: Utilize os operadores de resto e divisão para pegar os dígitos do
 número binário, um de cada vez, da direita para a esquerda.
 No sistema de números decimais, o dígito mais à direita tem um valor
 posicional de 1 e o próximo dígito à esquerda tem um valor posicional de
 10, depois 100, depois 1.000 e assim por diante.
 O número decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 *
 100.
 No sistema de números binários, o dígito mais à direita tem um valor
 posicional de 1, o próximo dígito à esquerda tem um valor posicional de
 2, depois 4, depois 8 e assim por diante. O equivalente decimal do binário
 1101 é 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, ou1 + 0 + 4 + 8 ou, 13.*/

public class ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valorDec = 0;
        boolean valido = true;
        int contador = 0;

        System.out.print("Digite um valor em binário: ");
        int valorBin = input.nextInt();

        while (valorBin > 0) {

            int digito = valorBin % 10;
            valorBin = valorBin / 10;

            if (digito != 1 && digito != 0) {
                valido = false;
            }
            valorDec += digito * (int) Math.pow(2, contador);
            contador++;
        }
        if (!valido){
            System.out.println("Valor inválido! Não é um número binário.");
        }
        else {
            System.out.printf("Convertendo para decimal: %d", valorDec);
        }

    }
}
