package lista03_repeticao;

import java.util.Scanner;

/*
   1. Faça um algoritmo que leia um número n, some todos os números pares inteiros
de 1 a n, e mostre o resultado obtido.
 */
public class Exercicio01_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        int n = ler.nextInt();
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma é " + soma);
    }
}
