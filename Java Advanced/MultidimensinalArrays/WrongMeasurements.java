package JavaAdvance.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][];
        int[][] originalMatrix = new int[n][];
        int size = 0;
        for (int i = 0; i < n; i++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = currentRow;
            size = currentRow.length;
        }
        originalMatrix = new int[n][size];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < size; j++) {
                originalMatrix[i][j] = matrix[i][j];
            }
        }
        String[] rowAndColOfInvalid = scanner.nextLine().split("\\s+");
        int rowOfInvalid = Integer.parseInt(rowAndColOfInvalid[0]);
        int colOfInvalid = Integer.parseInt(rowAndColOfInvalid[1]);
        int invalidNumber = matrix[rowOfInvalid][colOfInvalid];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == invalidNumber) {
                    matrix[i][j] = 0;
                    if (i - 1 >= 0 && originalMatrix[i - 1][j] != invalidNumber) {
                        matrix[i][j] += matrix[i - 1][j];
                    }
                    if (i + 1 <= n - 1 && originalMatrix[i + 1][j] != invalidNumber) {
                        matrix[i][j] += matrix[i + 1][j];
                    }
                    if (j - 1 >= 0 && originalMatrix[i][j - 1] != invalidNumber) {
                        matrix[i][j] += matrix[i][j - 1];
                    }
                    if (j + 1 <= size - 1 && originalMatrix[i][j + 1] != invalidNumber) {
                        matrix[i][j] += matrix[i][j + 1];
                    }
                }
            }
        }
        for (int[] number : matrix) {
            System.out.println();
            for (int num : number) {
                System.out.print(num + " ");
            }
        }
    }
}
