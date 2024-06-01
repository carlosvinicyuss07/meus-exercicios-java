package lista01_entrada_saida;

/*
   1. Faça um programa em Java que receba o número de lados de um polígono
convexo, calcule e mostre o número de diagonais desse polígono, onde N é o
número de lados do polígono.
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("Informe o número de lados do polígono: ");
        Scanner teclado = new Scanner(System.in);
        byte numLados = teclado.nextByte();
        int diagonais = (numLados * (numLados - 3))/2;
        System.out.println("O número de diagonais desse polígono é: " + diagonais);
    }
}
