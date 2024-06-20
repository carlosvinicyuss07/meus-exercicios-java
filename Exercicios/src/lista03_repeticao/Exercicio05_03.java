package lista03_repeticao;

import java.util.Scanner;

/*
   5. Em um concurso de miss IFS - Lagarto, os jurados precisam digitar o nome das
candidatas e suas respectivas notas (0 a 10). Crie um algoritmo que leia estas
informações e que, ao final do algoritmo, apresente apenas o nome e a nota da
vencedora (considere que não haverá empate). Para finalizar, deve-se digitar o
nome "FIM"
 */
public class Exercicio05_03 {
    public static void main(String[] args) {
        Scanner lerNomes = new Scanner(System.in), lerNotas = new Scanner(System.in);
        int i = 0;
        double maiorNota = 0;
        String vencedora = "";

        System.out.println("----- CONCURSO MISS IFS -----");
        while (i <= 1) {
            System.out.println("Para finalizar digite 'FIM'");
            System.out.print("Nome da candidata: ");
            String candidataAtual = lerNomes.nextLine();
            if (candidataAtual.equals("FIM")) {
                break;
            }
            System.out.print("Nota (0 a 10): ");
            double notaAtual = lerNotas.nextDouble();

            if (notaAtual > maiorNota) {
                maiorNota = notaAtual;
                vencedora = candidataAtual;
            }
        }
        System.out.println("-------------------");
        System.out.printf("A vencedora é " + vencedora + " com a nota %.2f",maiorNota);
    }
}