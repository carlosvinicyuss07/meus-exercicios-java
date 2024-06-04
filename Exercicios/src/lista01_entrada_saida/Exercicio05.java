package lista01_entrada_saida;
/*
   5. Construa um algoritmo que leia quatro valores inteiros A, B, C e D. A seguir,
calcule e mostre a diferença do produto de A e B pelo produto de C e D.
 */


import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int valorA = ler.nextInt();
        System.out.println("Digite o valor de B: ");
        int valorB = ler.nextInt();
        System.out.println("Digite o valor de C: ");
        int valorC = ler.nextInt();
        System.out.println("Digite o valor de D: ");
        int valorD = ler.nextInt();
        int resultado = (valorA * valorB) - (valorC * valorD);
        System.out.println("O resultado de (A * B)-(C * D) é " + resultado);
    }
}
