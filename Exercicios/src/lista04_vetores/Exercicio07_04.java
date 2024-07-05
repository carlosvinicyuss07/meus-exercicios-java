package lista04_vetores;

import java.util.Random;
import java.util.Scanner;

/*
   6. Faça um algoritmo para ler e armazenar um vetor A com 10 números inteiros e
em seguida ler um outro conjunto de números inteiros, onde o flag será o valor 0.
Para cada número lido informar se ele ocorre ou não no conjunto A e quantas
vezes ele aparece.
 */
public class Exercicio07_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random numerosA = new Random();
        int[] conjuntoA = new int[50];
        int[] conjuntoB = new int[50];

        for (int i = 0; i < conjuntoA.length; i++) {
            conjuntoA[i] = numerosA.nextInt(100);
        }

        for (int i = 0; i < conjuntoA.length; i++) {
            System.out.print("Elemento conjuntoB[" + i + "] : ");
            conjuntoB[i] = ler.nextInt();
            if (conjuntoB[i] == 0) {
                System.out.println("Finalizando...");
                break;
            }

            boolean ocorreEmA = false;
            int repeticoes = 0;
            for (int j = 0; j < conjuntoA.length; j++) {
                if (conjuntoB[i] == conjuntoA[j]) {
                    ocorreEmA = true;
                    repeticoes++;
                } else if (j == conjuntoA.length - 1 && !ocorreEmA) {
                    System.out.println("NÃO ocorre no conjunto A!");
                }
            }
            if (ocorreEmA) {
                if (repeticoes == 1) {
                    System.out.println("Ocorre 1 vez no conjunto A");
                } else {
                    System.out.println("Ocorre " + repeticoes + " vezes no conjunto A");
                }
            }
        }
    }
}