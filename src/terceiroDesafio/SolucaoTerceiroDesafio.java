package terceiroDesafio;

import java.util.Arrays;
import java.util.Scanner;

public class SolucaoTerceiroDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do array e o valor alvo (n k): ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDifference(arr, k);
        System.out.println("Número de pares com diferença igual a " + k + ": " + count);

        scanner.close();
    }
    public static int countPairsWithDifference(int[] arr, int k) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Arrays.binarySearch(arr, arr[i] + k) >= 0) {
                count++;
            }
        }
        return count;
    }
}
