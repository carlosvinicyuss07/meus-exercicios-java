package lista02_selecao;

import javax.swing.*;

/*
   7. Faça um algoritmo para ler um número que é um código de usuário. Caso este
código seja diferente de um código armazenado internamente no algoritmo (igual
a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja
correto, deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a
certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja
correta, deve ser mostrada a mensagem ‘Acesso permitido’.
 */
public class Exercicio07_02 {
    public static void main(String[] args) {
        String codigoArmazenado = "1234";
        String codigoUsuario = JOptionPane.showInputDialog("Digite o código de usuário");

        if (codigoUsuario.equals(codigoArmazenado)) {
            String senhaArmazenada = "9999";
            String senhaUsuario = JOptionPane.showInputDialog("Digite a senha");
            if (senhaUsuario.equals(senhaArmazenada)) {
                JOptionPane.showMessageDialog(null, "Acesso permitido!");
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuário inválido");
        }
    }
}
