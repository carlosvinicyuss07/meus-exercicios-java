package lista02_selecao;

import javax.swing.*;

/*
   8. Nos parques de diversão, alguns brinquedos têm idade e altura mínimas para
poder andar neles. O parque Ambrolândia possui três brinquedos que possuem
essa limitação:

Barca Viking:     1,5m de altura e 12 anos.
ElevatorofDeath:  1,4m de altura e 14 anos.
Final Killer:     1,7m de altura ou 16 anos.

Dada a altura e a idade de uma pessoa, faça um algoritmo que identifique quantos
brinquedos ele pode andar.
 */
public class Exercicio08_02 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Qual a sua altura? ");
        double altura = Double.parseDouble(a);
        String i = JOptionPane.showInputDialog("Qual a sua idade? ");
        byte idade = Byte.parseByte(i);

        if (idade >= 12 && idade < 14) {
            if (altura >= 1.7) {
                JOptionPane.showMessageDialog(null, "Permissão para 2 brinquedo");
            } else if (altura >= 1.5) {
                JOptionPane.showMessageDialog(null, "Permissão para 1 brinquedo");
            } else {
                JOptionPane.showMessageDialog(null, "Você não tem nenhuma permissão");
            }
        } else if (idade >= 14 && idade < 16) {
            if (altura >= 1.7) {
                JOptionPane.showMessageDialog(null, "Permissão para todos os 3 brinquedo");
            } else if (altura >= 1.5) {
                JOptionPane.showMessageDialog(null, "Permissão para 2 brinquedos");
            } else if (altura >= 1.4) {
                JOptionPane.showMessageDialog(null, "Permissão para 1 brinquedo");
            } else {
                JOptionPane.showMessageDialog(null, "Você não tem nenhuma permissão");
            }
        } else if (idade >= 16) {
            if (altura >= 1.7) {
                JOptionPane.showMessageDialog(null, "Permissão para todos os 3 brinquedos");
            } else if (altura >= 1.5) {
                JOptionPane.showMessageDialog(null, "Permissão para todos os 3 brinquedos");
            } else if (altura >= 1.4) {
                JOptionPane.showMessageDialog(null, "Permissão para 2 brinquedo");
            }
        } else {
            if (altura >= 1.7) {
                JOptionPane.showMessageDialog(null, "Permissão para 1 brinquedo");
            } else {
                JOptionPane.showMessageDialog(null, "Você não tem nenhuma permissão");
            }
        }
    }
}