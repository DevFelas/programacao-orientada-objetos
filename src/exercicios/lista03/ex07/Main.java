package exercicios.lista03.ex07;

public class Main {

    public static void main(String[] args) {

        Conteudo[] catalogo = new Conteudo[6];

        catalogo[0] = new Filme("O Senhor dos Anéis", 178);
        catalogo[1] = new Filme("Interestelar", 169);

        catalogo[2] = new Serie("Breaking Bad", 5);
        catalogo[3] = new Serie("Stranger Things", 5);

        catalogo[4] = new Documentario("Planeta Terra", "Natureza");
        catalogo[5] = new Documentario("O Dilema das Redes", "Tecnologia e sociedade");

        for (Conteudo c : catalogo) {
            c.exibirInformacoes();
        }
    }

}
