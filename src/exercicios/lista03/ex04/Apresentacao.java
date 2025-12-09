package exercicios.lista03.ex04;

public class Apresentacao extends Avaliacao{

    @Override
    public double calcularNotaFinal() {
        double notaFinal = notaBase + 2;
        if ( notaFinal > 10) {
            notaFinal = 10;
        }
        return notaFinal;
    }

}
