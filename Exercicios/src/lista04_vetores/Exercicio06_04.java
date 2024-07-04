package lista04_vetores;

import java.util.Random;
import java.util.Scanner;

/*
   6. Faça um algoritmo que leia um vetor de números inteiros com, no máximo, 100
posições. Em seguida, crie um vetor resultante contendo todos os números primos
do vetor digitado.
Obs: O tamanho efetivo do vetor deverá ser lido do usuário.
 */
public class Exercicio06_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random preencheVetor = new Random();
        System.out.print("Defina a quantidade de elementos do vetor(Obs. Máx 100): ");
        int[] vetor = new int[ler.nextInt()];
        int[] primos = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = preencheVetor.nextInt(100);
            int qtdDeDivisores = 0;
            for (int j = 1; j <= vetor[i]; j++) {
                if (vetor[i] % j == 0) {
                    qtdDeDivisores++;
                }
            }
            if (qtdDeDivisores == 2) {
                primos[i] = vetor[i];
            }
        }

        for (int primo : primos) {
            if (primo != 0) {
                System.out.print(primo + " ");
            }
        }
    }
}