package lista04_vetores;
/*
   5. Faça um algoritmo para ler e armazenar um conjunto A, com 50 números inteiros
e em seguida ler um outro conjunto de números inteiros, onde o flag será o valor
0.
Para cada número lido informar se ele ocorre ou não no conjunto A.
 */

import java.util.Random;
import java.util.Scanner;

public class Exercicio05_04 {
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

            for (int j = 0; j < conjuntoA.length; j++) {
                if (conjuntoB[i] == conjuntoA[j]) {
                    System.out.println("Ocorre no conjunto A!");
                    break;
                } else if (j == conjuntoA.length - 1) {
                    System.out.println("NÃO ocorre no conjunto A!");
                }
            }
        }
    }
}