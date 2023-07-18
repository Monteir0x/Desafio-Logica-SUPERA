package quartoDesafio;

import java.util.Scanner;

public class SolucaoQuartoDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de casos de teste: ");
        int numCasos = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite as frases a serem desembaralhadas:");
        for (int i = 0; i < numCasos; i++) {
            String linha = scanner.nextLine();
            int meio = linha.length() / 2;

            String esquerda = new StringBuilder(linha.substring(0, meio)).reverse().toString();
            String direita = new StringBuilder(linha.substring(meio)).reverse().toString();

            System.out.println(esquerda + direita);
        }
        scanner.close();
    }
}
