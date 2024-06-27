package lista04_vetores;
/*
   1. Faça um algoritmo para ler a nota da prova de 15 alunos e armazene num vetor,
calcule e imprima a média geral.
 */

import java.util.Scanner;

public class Exercicio01_04 {
    public static void main(String[] args) {
        Scanner lerNotas = new Scanner(System.in);
        double[] notas = new double[15];
        double somaDasNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do " + (i+1) + "º aluno: ");
            notas[i] = lerNotas.nextDouble();
            somaDasNotas += notas[i];
        }

        double mediaGeral = somaDasNotas / notas.length;
        System.out.printf("A média geral da turma é %.1f",mediaGeral);
    }
}