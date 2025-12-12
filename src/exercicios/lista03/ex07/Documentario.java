package exercicios.lista03.ex07;

public class Documentario extends Conteudo{

    private String tema;

    public Documentario(String titulo, String tema) {
        super(titulo);
        this.tema = tema;
    }

    public void exibirInformacoes() {
        System.out.println("Documentário: " + titulo);
        System.out.println("Tema: " + tema);
        System.out.println();
    }

}
