package lista04_vetores;
/*
   2. Leia um vetor com 20 números inteiros. Escreva os elementos do vetor
eliminando elementos repetidos.
 */

import java.util.Scanner;

public class Exercicio02_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i+1) + "° número: ");
            numeros[i] = ler.nextInt();
        }

        boolean isRepetido;
        for (int i = 0; i < numeros.length -1; i++) {
        isRepetido = false;
            for (int j = 0; j <= (i - 1) ; j++) {
                if (numeros[i] == numeros[j]) {
                    isRepetido = true;
                    break;
                }
            }

            if (!isRepetido) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}