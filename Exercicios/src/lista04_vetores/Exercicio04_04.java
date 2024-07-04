package lista04_vetores;
/*
   4. Faça um algoritmo que leia dois vetores de 10 posições e calcule outro vetor
contendo, nas posições pares os valores do primeiro e nas posições impares os
valores do segundo.
 */

import java.util.Scanner;

public class Exercicio04_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Elemento " + i + " do vetor A: ");
            vetorA[i] = ler.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Elemento " + i + " do vetor B: ");
            vetorB[i] = ler.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            if (i%2 == 0) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[i];
            }
            System.out.print(vetorC[i] + " ");
        }
    }
}