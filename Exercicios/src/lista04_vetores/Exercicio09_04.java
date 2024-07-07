package lista04_vetores;

import java.util.Scanner;

/*
   9. Faça um algoritmo que leia um vetor de 15 posições e o compacte, ou seja, elimine
as posições com valor zero. Para isso, todos os elementos à frente do valor zero,
devem ser movidos uma posição para trás no vetor.
 */

public class Exercicio09_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[15];

        // 1º Lê o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + i + "º elemento do vetor: ");
            vetor[i] = ler.nextInt();
        }

        // 2º Compacta o vetor
        int[] vetorCompactado = compactaVetor(vetor);

        // 3º Escreve na tela o vetor compactado
        System.out.print("Vetor Compactado: ");
        for (int i = 0; i < vetorCompactado.length; i++) {
            System.out.print(vetorCompactado[i] + " ");
        }
    }

    public static int[] compactaVetor(int[] vetor) {
        // Cria um vetor temporário
        int[] vetorTemp = new int[vetor.length];
        int j = 0;

        // Percorre o vetor original e copia os elementos com valores diferentes de 0 para o vetor temporário
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                vetorTemp[j++] = vetor[i];
            }
        }

        // Transfere os valores do vetor temporário para o vetor compactado de tamanho adequado
        int[] vetorCompactado = new int[j];
        for (int i = 0; i < vetorCompactado.length; i++) {
            vetorCompactado[i] = vetorTemp[i];
        }

        return vetorCompactado;
    }
}