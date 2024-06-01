package lista01_entrada_saida;

import java.util.Scanner;

/*
   2. Desenvolva um algoritmo que leia um número inteiro e exiba o resultado do
quadrado deste número.
 */
public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int quad = (int) Math.pow(num,2);
        System.out.println("O quadrado do número digitado é : " + quad);
    }
}
