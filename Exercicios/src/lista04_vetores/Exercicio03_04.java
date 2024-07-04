package lista04_vetores;
/*
   3. Faça um algoritmo que receba do usuário um vetor com 10 posições. Em seguida
deverá ser impresso o maior e o menor elemento do vetor.
 */

import java.util.Scanner;

public class Exercicio03_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[10];
        int maiorNum = 0;
        int menorNum = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = ler.nextInt();
            
            if (i == 0) {
                menorNum = vetor[i];
            } else if (vetor[i] < menorNum) {
                menorNum = vetor[i];
            } else if (vetor[i] > maiorNum) {
                maiorNum = vetor[i];
            }
        }

        System.out.println("O maior elemento do vetor é: " + maiorNum);
        System.out.println("O menor elemento do vetor é: " + menorNum);
    }
}