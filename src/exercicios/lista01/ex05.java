package exercicios.lista01;
import java.util.Scanner;

/** Escreva um aplicativo de calculadora que receba um valor em ponto
 flutuante, um operador e a seguir mais um valor em ponto flutuante. Utilize
 o comando switch para realizar a conta para as operações de soma,
 subtração, multiplicação e divisão e exiba o resultado. Caso o operador
 seja inválido ou ocorra uma divisão por zero, uma mensagem de erro deve
 ser mostrada. */

public class ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Valor 1: ");
        float valor1 = input.nextFloat();

        input.nextLine();

        System.out.print("Operador: ");
        String operador = input.nextLine();

        System.out.print("Valor 2 :");
        float valor2 = input.nextFloat();
        float result = 0;

        switch (operador) {
            case "+":
                result = valor1 + valor2; break;
            case "-":
                result = valor1 - valor2; break;
            case "*":
                result = valor1 * valor2; break;
            case "/":
                result = valor1 / valor2; break;
            default:
                System.out.println("Operação inválida!!");

        }

        System.out.println(valor1 + operador + valor2 + " = " + result);

    }
}
