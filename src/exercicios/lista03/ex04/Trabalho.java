package exercicios.lista03.ex04;

public class Trabalho extends Avaliacao {

    @Override
    public double calcularNotaFinal() {
        double notaFinal = notaBase * 0.9 + 1;
        if ( notaFinal > 10 ) {
            notaFinal = 10;
        }
        return notaFinal;
    }

}
