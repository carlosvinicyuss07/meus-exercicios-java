package lista03_repeticao;

import java.util.Scanner;

/*
   9. Faça um algoritmo para ler números inteiros, onde o Flag será o valor 0 e sem
seguida escrever o menor número primo lido e quantas vezes este ocorreu nos
números lidos.
 */
public class Exercicio09_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        int menorPrimo = 0;
        int qtdvezes = 0;

        System.out.println("*Digite 0 para encerrar*");
        do {
            System.out.print("Digite um número: ");
            n = ler.nextInt();
            int divisores = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                if (qtdvezes == 0) {
                    menorPrimo = n;
                }

                if (n == menorPrimo) {
                    qtdvezes++;
                } else if (n < menorPrimo) {
                    menorPrimo = n;
                    qtdvezes = 1;
                }
            }
        } while (n != 0);

        System.out.println("O menor número primo lido foi " + menorPrimo);
        if (qtdvezes == 1) System.out.println("Lido 1 vez");
        else System.out.println("Lido " + qtdvezes + " vezes");
    }
}