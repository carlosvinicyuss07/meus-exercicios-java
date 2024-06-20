package lista03_repeticao;

import java.util.Scanner;

/*
   4. Faça um algoritmo que leia 20 números inteiros do usuário e informe, ao final, os
dois menores números lidos
 */
public class Exercicio04_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int count = 1;
        int menorNum1 = 0;
        int menorNum2 = 0;

        while (count <= 20) {
            System.out.print("Digite um número: ");
            int numAtual = ler.nextInt();

            if (count == 1) {
                menorNum1 = numAtual;
            } else if (count == 2) {
                if (numAtual < menorNum1) {
                    menorNum1 = numAtual;
                } else {
                    menorNum2 = numAtual;
                }
            } else {
                if (numAtual < menorNum1) {
                    menorNum1 = numAtual;
                } else if (numAtual < menorNum2) {
                    menorNum2 = numAtual;
                }
            }
            count++;
        }
        System.out.println("Os dois menores números digitados foram " + menorNum1 + " e " + menorNum2);
    }
}