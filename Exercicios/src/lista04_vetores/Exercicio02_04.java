package lista04_vetores;
/*
   2. Leia um vetor com 20 números inteiros. Escreva os elementos do vetor
eliminando elementos repetidos.
 */

import java.util.Scanner;

public class Exercicio02_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i+1) + "° número: ");
            numeros[i] = ler.nextInt();
        }

        for (int i = 0; i < numeros.length -1; i++) {
            for (int j = 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    numeros[j] = 0;
                }
            }
        }

        for (int elemento: numeros) {
            if (elemento == 0) {
                continue;
            }
            System.out.println(elemento);
        }
    }
}