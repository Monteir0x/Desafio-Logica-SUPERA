package segundoDesafio;

import java.util.Locale;
import java.util.Scanner;

public class SolucaoSegundoDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double valor = 0;
        while (true) {
            System.out.println("Digite o valor monetário: ");
            try {
                valor = scanner.nextDouble();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um valor numérico válido.");
                scanner.next();
            }
        }
        int[] notas = { 100, 50, 20, 10, 5, 2 };
        double[] moedas = { 1, 0.50, 0.25, 0.10, 0.05, 0.01 };
        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidade = (int) (valor / nota);
            valor %= nota;
            System.out.println(quantidade + " nota(s) de R$ " + nota + ".00");
        }
        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int quantidade = (int) (valor / moeda);
            valor %= moeda;
            System.out.println(quantidade + " moeda(s) de R$ " + String.format("%.2f", moeda));
        }
        scanner.close();
    }
}
