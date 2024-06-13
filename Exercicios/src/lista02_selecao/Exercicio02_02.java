package lista02_selecao;
/*
   2. Construa um programa que leia dois valores numéricos e exiba a diferença do
maior valor pelo menor valor.
 */

import java.util.Scanner;

public class Exercicio02_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = ler.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = ler.nextInt();

        System.out.print("A diferença do maior valor pelo menor valor é ");
        if (valor1 > valor2) {
            System.out.println(valor1 - valor2);
        } else if (valor2 > valor1) {
            System.out.println(valor2 - valor1);
        } else {
            System.out.println("0");
        }
    }
}
