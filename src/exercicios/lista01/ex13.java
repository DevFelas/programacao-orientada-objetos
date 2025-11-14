package exercicios.lista01;

public class ex13 {
    public static void main(String[] args) {

        for ( int i = 1000 ; i < 10000 ; i++) {

            int ab = i / 100;
            int cd = i % 100;

            int ef = ab + cd;

            if ( Math.pow(ef, 2) == i ) {
                System.out.println(i);
            }
        }
    }
}
