package lista01_entrada_saida;
/*
   6. Faça um algoritmo que leia do usuário um número inteiro de 4 dígitos e no final
imprima o número na ordem inversa. Ex: 1 2 3 4 => 4 3 2 1
 */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número de 4 dígitos: ");
        int num = ler.nextInt();
        int unidade = (int) num / 1000;
        int dezena = (int) ((num % 1000) / 100);
        int centena = (int) (((num % 1000) % 100) / 10);
        int milhar = ((num % 1000) % 100) % 10;
        int numInv = (milhar * 1000) + (centena * 100) + (dezena * 10) + unidade;
        System.out.println("A ordem inversa desse número é: " + numInv);
    }
}
