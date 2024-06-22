package lista03_repeticao;

import java.util.Scanner;

/*
   6. Faça um algoritmo para ler um número inteiro e informar no final se ele é primo
ou não.
 */
public class Exercicio06_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = ler.nextInt();
        int qtdDeDivisores = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                qtdDeDivisores++;
            }
        }

        if (qtdDeDivisores == 2) {
            System.out.println("O número " + num + " É PRIMO!");
        } else {
            System.out.println("O número " + num + " NÃO É PRIMO!");
        }
    }
}