package lista03_repeticao;

import java.util.Scanner;

/*
   3. Desenvolva um algoritmo que leia dois números, X e Y (X<Y). A seguir mostre
uma sequência de 1 a Y, passando para a próxima linha a cada X números.

Exemplo: Para X = 8 e Y = 16, a saída seria:
1 2 3 4 5 6 7 8
9 10 11 12 13 14 15 16
 */
public class Exercicio03_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Observação X deve ser MENOR que Y");
        System.out.print("Valor de X: ");
        int x = ler.nextInt();
        System.out.print("Valor de Y: ");
        int y = ler.nextInt();

        for (int i=1; i <= y; i++) {
            if (i % x == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}