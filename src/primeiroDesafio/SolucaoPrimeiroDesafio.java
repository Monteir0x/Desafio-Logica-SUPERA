package primeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SolucaoPrimeiroDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de números na lista:");
        int a = scanner.nextInt();

        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            System.out.println("Digite o número " + (i + 1) + " da lista:");
            numeros.add(scanner.nextInt());
        }

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        numeros.forEach(numero -> {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        });

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        System.out.println("Resultados:");
        pares.forEach(System.out::println);
        impares.forEach(System.out::println);

        scanner.close();
    }
}

