package lista01_entrada_saida;
/*
   4. Desenvolva um algoritmo que leia um valor inteiro correspondente à idade de uma
pessoa em dias e informe-a em anos, meses e dias. (Observação: apenas para
facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias).
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe sua idade em dias: ");
        int idadeDias = ler.nextInt();
        int anos = (int) idadeDias / 365;
        int meses = (int) ((idadeDias % 365) / 30);
        int dias = (int) ((idadeDias % 365) % 30);
        System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias de idade.");
    }
}
