package exercicios.lista02.ex02;
import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Livro livros[] = new Livro[3];

        for (int i = 0; i < 3; i++) {
            Livro l = new Livro();

            System.out.println("Titulo do "+ (i+1) + "° livro: ");
            String titulo = input.nextLine();
            l.setTitulo(titulo);

            System.out.println("Autor do "+ (i + 1) + "° livro: ");
            String autor = input.nextLine();
            l.setAutor(autor);

            System.out.println("Ano de publicação do " + (i+1) + "° livro");
            int data = input.nextInt();
            input.nextLine();
            l.setAno_publicacao(data);

            livros[i] = l;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nLivro: " + livros[i].getTitulo());
            System.out.println("Autor: " + livros[i].getAutor());
            System.out.println("Data de publicação: " + livros[i].getAno_publicacao() + "\n");
        }

    }

}
