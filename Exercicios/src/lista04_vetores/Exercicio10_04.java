package lista04_vetores;

import java.util.Scanner;

/*
   10. Faça um algoritmo que receba um conjunto de números, onde o FLAG será igual
a 0, e que calcule e mostre a porcentagem de números primos.
 */
public class Exercicio10_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetorConjunto = new int[1];
        int novoTamanho = 1;

        // Lê o vetor e aumenta seu tamanho adequadamente
        System.out.println("Para finalizar digite o FLAG 0:  ");
        for (int i = 0; i < vetorConjunto.length; i++) {
            System.out.print("Elemento [" + i + "] do conjunto: ");
            vetorConjunto[i] = ler.nextInt();
            // Adiciona +1 elemento a cada número diferente de 0 que é digitado
            if (vetorConjunto[i] != 0) {
                novoTamanho += 1;
                vetorConjunto = aumentaVetor(vetorConjunto, novoTamanho);
            }
        }

        // Encontra os números primos dentro do conjunto
        int totalDePrimos = 0;
        for (int j = 0; j < vetorConjunto.length; j++) {
            if (verificaPrimos(vetorConjunto[j])) {
                totalDePrimos++;
            }
        }

        // Calcula e exibe a porcentagem de números primos
        double porcentagemDePrimos = calculaPorcentagem(totalDePrimos, vetorConjunto.length);
        System.out.println("A porcentagem de números primos nesse conjunto é de " + porcentagemDePrimos + "%");
    }

    public static int[] aumentaVetor(int[] vetorConjunto, int novoTamanho) {
        int[] vetorAumentado = new int[novoTamanho];

        for (int j = 0; j < vetorConjunto.length; j++) {
            vetorAumentado[j] = vetorConjunto[j];
        }

        return vetorAumentado;
    }

    public static boolean verificaPrimos(int num) {
        boolean isPrimo = false;
        int divisores = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            isPrimo = true;
        }

        return isPrimo;
    }

    public static double calculaPorcentagem(int primos, int elementos) {
        // (elementos - 1) para eliminar o FLAG 0 do calculo
        double porcentagem = (primos * 100) / (elementos - 1);

        return porcentagem;
    }
}