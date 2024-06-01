package lista01_entrada_saida;

import java.util.Locale;
import java.util.Scanner;

/*
   3. Construa um algoritmo que calcule o consumo médio de um automóvel sendo
fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em
litros).
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        System.out.println("Distância percorrida(Km): ");
        float dist = teclado.nextFloat();
        System.out.println("Combustível gasto(L): ");
        float comb = teclado.nextFloat();
        float consumo = comb/dist;
        System.out.printf("Consumo Médio: %.2f L/Km rodado.", consumo);
    }
}
