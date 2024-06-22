package lista03_repeticao;

import java.util.Scanner;

/*
    8. Faça um algoritmo que leia um número N e imprima como resposta N!
 */
public class Exercicio08_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = ler.nextInt();
        int nFatorial = 1;

        for (int i = 1; i <= n; i++) {
            nFatorial *= i;
        }

        System.out.println(nFatorial);
    }
}