package lista02_selecao;

import java.util.Scanner;

/*
   4. A sorveteria Tropical oferece uma diversidade de sabores e os preços são os
seguintes:
Sabor             | Preço por bola
Morango/Cereja    |R$ 4,50
Damasco/Siriguela |R$ 3,80
Outros sabores    |R$ 2,75

Caso o cliente consuma mais de duas bolas, ele tem direito a uma calda de
caramelo. Sabendo disso, escreva um algoritmo que receba como entrada o sabor
e a quantidade de bolas desejada por um cliente, e exiba o valor total a ser pago e
uma mensagem informando se o sorvete terá calda ou não.
 */
public class Exercicio04_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Faça seu pedido!");
        System.out.print("Sabor do sorvete: ");
        String sabor = ler.nextLine();
        System.out.print("Quantidade de bolas: ");
        int qtdBolas = ler.nextInt();

        double valor;
        if (sabor.equals("Morango") || sabor.equals("Cereja")) {
            valor = qtdBolas * 4.5;
        } else if (sabor.equals("Damasco") || sabor.equals("Siriguela")) {
            valor = qtdBolas * 3.8;
        } else {
            valor = qtdBolas * 2.75;
        }

        boolean withCalda = qtdBolas > 2;

        System.out.println("Valor total: R$" + valor);
        System.out.println((withCalda)?"Com calda":"Sem calda");
    }
}
