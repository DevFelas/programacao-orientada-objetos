package exercicios.lista02.ex02;

public class Livro {

    private String titulo;
    private String autor;
    private int ano_publicacao;

    public Livro() {
        this.titulo = " ";
        this.autor = " ";
        this.ano_publicacao = 0;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }
}
