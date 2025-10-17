package aulas.a03Repeticao;

public class Foreach_pesquisa {
//    public static void main(String[] args) {
//        int[] numeros = {10, 20, 30, 40, 50};
//
//        for (int n : numeros) { // n = índice temporário que tem que ser do mesmo tipo dos elementos do vetor
//            System.out.println("Números: " + n);
//        }
//    }

//    public static void main(String[] args) {
//        String[] nomes = {"Ana", "Bruno", "Carla", "Daniel"};
//        String procurado = "Carla";
//        boolean encontrado = false;
//
//        for (String nome : nomes) {
//            if (nome.equals(procurado)) {
//                encontrado = true;
//                break;
//            }
//        }
//
//        if (encontrado) {
//            System.out.println(procurado + " está na lista.");
//        } else {
//            System.out.println(procurado + " não foi encontrado.");
//        }
//    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int i : vetor) {
            soma += i;
        }

        System.out.println("Soma de todos os valores do vetor: " + soma);
    }
}
