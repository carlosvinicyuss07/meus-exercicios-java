package lista03_repeticao;

import java.util.Random;
import java.util.Scanner;

/*
   10. Faça um algoritmo que sorteie um número qualquer (entre 1 e 100) e solicite ao
usuário adivinhar esse número. Para facilitar, informe ao usuário se o número que
ele digitou é maior ou menor que o número sorteado. O algoritmo só termina
quando o usuário acerta o número.
 */
public class Exercicio10_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();
        int numeroSorteado = gerador.nextInt(100) + 1;

        System.out.println("Um número entre 1 e 100(inclusive) foi sorteado!");
        int numeroDigitado;
        do {
            System.out.println("Tente adivinhar o número sorteado: ");
            numeroDigitado = ler.nextInt();

            if (numeroDigitado > numeroSorteado) {
                System.out.println("Errou, o número digitado é MAIOR do que o sorteado.");
            } else if (numeroDigitado < numeroSorteado) {
                System.out.println("Errou, o número digitado é MENOR do que o sorteado.");
            } else {
                System.out.println("Parabéns, você acertou!");
            }
        } while (numeroSorteado != numeroDigitado);
    }
}