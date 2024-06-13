package lista02_selecao;

import java.util.Scanner;

/*
   5. A Locadora de Veículos Eudora lançou uma grande promoção esse mês: pagando
apenas R$ 90 por diária, o cliente pode alugar um carro de passeio. Para cada
diária, o cliente recebe uma cota de quilometragem de 100 Km. Cada quilômetro
a mais custará uma taxa extra de R$ 12. Escreva um algoritmo que receba como
entrada a quantidade de dias e a quilometragem total rodada por um cliente dessa
locadora e exiba o valor total a ser pago com duas casas decimais.
 */
public class Exercicio05_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("--- ALUGUEL DE CARROS ---");
        System.out.println("Quantidade de dias: ");
        int dias = ler.nextInt();
        System.out.println("Quilometragem total rodada: ");
        double km = ler.nextDouble();

        double valorTotal;
        if (km > (dias * 100)) {
            valorTotal = (dias * 90) + (km - (dias * 100)) * 12;
        } else {
            valorTotal = (dias * 90);
        }
        System.out.printf("Valor Total: R$ %.2f",valorTotal);
    }
}