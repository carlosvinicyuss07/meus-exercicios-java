package lista03_repeticao;

import java.util.Scanner;

/*
   7. Faça um algoritmo para ler um número inteiro e imprimir os próximos seis
números primos a partir desse número lido.

Exemplo:
Número Lido: 4
Resultado: 5, 7, 11, 13, 17, 19
 */
public class Exercicio07_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = ler.nextInt();
        int qtdDePrimos = 0;

        do {
            int divisores = 0;
            num++;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.print(num + " ");
                qtdDePrimos += 1;
            }
        } while (qtdDePrimos < 6);
    }
}