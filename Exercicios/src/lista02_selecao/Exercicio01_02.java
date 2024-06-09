package lista02_selecao;
/*
1. Faça um programa que leia a idade de uma pessoa e informe sua classe eleitoral:
• Não eleitor: abaixo de 16 anos;
• Eleitor obrigatório: maior e igual a 18 ou menor e igual a 65 anos;
• Eleitor facultativo: entre 16 e 18 anos ou acima dos 65 anos.*/

import javax.swing.*;

public class Exercicio01_02 {
    public static void main(String[] args) {
        String valorIdade = JOptionPane.showInputDialog("Qual sua idade? ");
        int idade = Integer.parseInt(valorIdade);
        if (idade < 16) {
            JOptionPane.showMessageDialog(null, "Não eleitor");
        } else if ((idade >= 16 && idade < 18) || (idade > 65)) {
            JOptionPane.showMessageDialog(null, "Eleitor facultativo");
        } else {
            JOptionPane.showMessageDialog(null, "Eleitor Obrigatório");
        }
    }
}
