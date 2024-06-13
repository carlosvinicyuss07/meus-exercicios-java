package lista02_selecao;

import java.util.Scanner;

/*
   3. Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere
que as idades dos homens serão sempre diferentes entre si, bem como as das
mulheres). Calcule e escreva a soma das idades do homem mais velho com a
mulher mais nova, e o produto das idades do homem mais novo com a mulher
mais velha
 */
public class Exercicio03_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe as idades dos dois homens, respectivamente: ");
        byte idadeHomem1 = ler.nextByte();
        byte idadeHomem2 = ler.nextByte();
        System.out.println("Informe as idades das duas mulheres, respectivamente: ");
        byte idadeMulher1 = ler.nextByte();
        byte idadeMulher2 = ler.nextByte();

        byte idadeHomemMaisVelho;
        byte idadeHomemMaisNovo;
        if (idadeHomem1 > idadeHomem2) {
            idadeHomemMaisVelho = idadeHomem1;
            idadeHomemMaisNovo = idadeHomem2;
        } else {
            idadeHomemMaisVelho = idadeHomem2;
            idadeHomemMaisNovo = idadeHomem1;
        }

        byte idadeMulherMaisVelha;
        byte idadeMulherMaisNova;
        if (idadeMulher1 > idadeMulher2) {
            idadeMulherMaisVelha = idadeMulher1;
            idadeMulherMaisNova = idadeMulher2;
        } else {
            idadeMulherMaisVelha = idadeMulher2;
            idadeMulherMaisNova = idadeMulher1;
        }

        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é " + (idadeHomemMaisVelho + idadeMulherMaisNova) + " anos");
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é " + idadeHomemMaisNovo * idadeMulherMaisVelha);
    }
}