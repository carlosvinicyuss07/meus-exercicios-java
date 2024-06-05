package lista01_entrada_saida;

import javax.swing.*;
import java.text.DecimalFormat;

/*
   7. Soraia foi fazer compras no supermercado de seu bairro e tomou um susto! A
dúzia de laranjas está caríssima, custando R$ 8,35! Faça um programa que receba
como entrada a quantidade total de laranjas que Soraia deseja comprar, e exiba
quantas dúzias ela vai adquirir e o valor total necessário para realizar a compra.
(Dica: uma dúzia corresponde a 12 laranjas, mas cada laranja também pode ser
vendida separadamente)
 */

public class Exercicio07 {
    public static void main(String[] args) {
        String qtd = JOptionPane.showInputDialog("Informe a quantidade de laranjas que você deseja comprar: ");
        int qtdLaranjas = Integer.parseInt(qtd);

        int duzia = qtdLaranjas / 12;
        int unidade = qtdLaranjas % 12;
        double precoDuzia = duzia * 8.35;
        double precoUnid = unidade * (8.35/12);
        double precoTotal = precoDuzia + precoUnid;

        // Formatação do Preço Total para ser exibido com 2 casas decimais
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedPreco = df.format(precoTotal);

        JOptionPane.showMessageDialog(null, "Você vai adiquirir um total de "+duzia+" duzias e "+unidade+" unidades.");
        JOptionPane.showMessageDialog(null, "Preço Total da Compra: R$"+formattedPreco);
    }
}