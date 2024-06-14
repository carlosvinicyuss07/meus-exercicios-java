package lista02_selecao;

import javax.swing.*;
import java.text.DecimalFormat;

/*
    6. O IMC – Indice de Massa Corporal é um critério da Organização Mundial de
Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. A
fórmula é IMC = peso / ( altura )^2
.
Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua
condição de acordo com a tabela abaixo:

Idade           |  Condição
  .             |      .
Abaixo de 18,5  |  Abaixo do peso
Entre 18,5 e 25 |  Peso Normal
Entre 25 e 30   |  Acima do peso
Acima de 30     |  Obeso
 */
public class Exercicio06_02 {
    public static void main(String[] args) {
        String peso = JOptionPane.showInputDialog("Qual seu peso? ");
        double p = Double.parseDouble(peso);
        String altura = JOptionPane.showInputDialog("Qual a sua altura? ");
        double a = Double.parseDouble(altura);

        double imc = p / Math.pow(a,2);
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        String imcFormatado = decimalFormat.format(imc);
        JOptionPane.showMessageDialog(null, "O seu IMC é " + imcFormatado);

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            JOptionPane.showMessageDialog(null, "Peso Normal");
        } else if (imc >= 25 && imc <= 30) {
            JOptionPane.showMessageDialog(null, "Acima do peso");
        } else {
            JOptionPane.showMessageDialog(null, "Obeso");
        }
    }
}
