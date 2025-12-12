package exercicios.lista03.ex07;

public class Filme extends Conteudo{

    private int duracaoMin;

    public Filme(String titulo, int duracaoMin) {
        super(titulo);
        this.duracaoMin = duracaoMin;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Filme: " + titulo);
        System.out.println("Duração: " + duracaoMin + " minutos");
        System.out.println();
    }

}
