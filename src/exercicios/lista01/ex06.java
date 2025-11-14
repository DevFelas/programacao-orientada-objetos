package exercicios.lista01;
import java.util.Scanner;

/**
 * 6. Escreva um método estático que receba uma cadeia de caracteres,
 * representada por uma String, que armazena o caminho do diretório raiz
 * até um arquivo específico.
 * Exemplo: C:\musicas\somewhereintime\themeofpaganini.mp3
 * O método deve retornar uma nova String contendo apenas o nome do
 * arquivo sem o caminho de diretórios.
 */

public class ex06 {

    static String retornarArquivo (String caminhoArquivo) {
        if ( caminhoArquivo == null ) {
            return null;
        }

        int indiceBarra = caminhoArquivo.lastIndexOf("\\");

        return caminhoArquivo.substring(indiceBarra + 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um caminho de diretório: ");
        String caminho = input.nextLine();

        System.out.println("Arquivo: "+ retornarArquivo(caminho));

    }
}
