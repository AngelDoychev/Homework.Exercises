package JavaAdvance.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[][] intMatrix = new int[rowsAndCols[0]][rowsAndCols[1]];
        for (int i = 0; i < rowsAndCols[0]; i++) {
            int[] rows = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < rowsAndCols[1]; j++) {
                intMatrix[i][j] = rows[j];
            }
        }
        int output = 0;
        for (int[] num : intMatrix) {
            for (int n : num) {
                output += n;
            }
        }
        System.out.println(rowsAndCols[0]);
        System.out.println(rowsAndCols[1]);
        System.out.println(output);
    }
}
