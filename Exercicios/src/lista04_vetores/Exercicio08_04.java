package lista04_vetores;

import java.util.Scanner;

/*
   7. Faça um algoritmo para ler dois vetores A e B, com no máximo 50 elementos
cada, sabendo que para cada vetor o número efetivo de elementos será lido e não
existirão elementos repetidos num mesmo vetor. Em seguida gere um terceiro
vetor formado pela Interseção do vetores A e B.
 */
public class Exercicio08_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o tamanho do vetor A: ");
        int[] vetorA = new int[ler.nextInt()];
        System.out.print("Informe o tamanho do vetor B: ");
        int[] vetorB = new int[ler.nextInt()];
        int[] vetorC = new int[50];
        if (vetorA.length > vetorB.length) {
            vetorC = new int[vetorB.length];
        } else {
            vetorC = new int[vetorA.length];
        }

        System.out.println("Informe os elementos do vetor A (Obs: SEM REPETIÇÕES)");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Elemento vetorA[" + i + "]: ");
            vetorA[i] = ler.nextInt();
        }

        int contadorVetorC = 0;
        System.out.println("Informe os elementos do vetor B (Obs: SEM REPETIÇÕES)");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Elemento vetorB[" + i + "]: ");
            vetorB[i] = ler.nextInt();
            for (int j = 0; j < vetorA.length; j++) {
                if (vetorB[i] == vetorA[j]) {
                    vetorC[contadorVetorC++] = vetorB[i];
                }
            }
        }

        System.out.print("Vetor C: ");
        for (int mostraVetorC : vetorC) {
            if (mostraVetorC != 0) {
                System.out.print(mostraVetorC + " ");
            }
        }
    }
}