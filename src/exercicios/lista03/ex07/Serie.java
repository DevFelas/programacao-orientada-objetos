package exercicios.lista03.ex07;

public class Serie extends Conteudo{

    private int temporadas;

    public Serie(String titulo, int temporadas) {
        super(titulo);
        this.temporadas = temporadas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Série: " + titulo);
        System.out.println("Temporadas: " + temporadas);
        System.out.println();
    }

}
