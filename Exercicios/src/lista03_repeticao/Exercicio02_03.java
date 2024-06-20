package lista03_repeticao;

import java.util.Scanner;

/*
   2. Uma empresa com X funcionários precisa saber a média de seus salários. Faça um
algoritmo que receba como entrada a quantidade de funcionários e o salário de
cada um e exiba a média dos salários.
 */
public class Exercicio02_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantidade de funcionários: ");
        int func = ler.nextInt();
        double somaSalarios = 0;

        for (int i = 1; i <= func; i++) {
            System.out.println("Funcionário n°"+i);
            System.out.print("Salário: R$");
            somaSalarios += ler.nextDouble();
        }

        double mediaSalarios = somaSalarios / func;
        System.out.printf("A média dos salários dos funcionários da empresa é R$%.2f",mediaSalarios);
    }
}