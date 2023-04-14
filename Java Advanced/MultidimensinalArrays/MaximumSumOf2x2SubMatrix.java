package JavaAdvance.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(", ");
        int row = Integer.parseInt(command[0]);
        int col = Integer.parseInt(command[1]);
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = currentRow;
        }
        int[][] biggestMatrix = new int[2][2];
        int biggestMatrixSum = Integer.MIN_VALUE;
        for (int rows = 0; rows < row - 1; rows++) {
            for (int cols = 0; cols < col - 1; cols++) {
                int sum = matrix[rows][cols] + matrix[rows][cols + 1] + matrix[rows + 1][cols] + matrix[rows + 1][cols + 1];
                if (biggestMatrixSum < sum) {
                    biggestMatrix[0][0] = matrix[rows][cols];
                    biggestMatrix[0][1] = matrix[rows][cols + 1];
                    biggestMatrix[1][0] = matrix[rows + 1][cols];
                    biggestMatrix[1][1] = matrix[rows + 1][cols + 1];
                    biggestMatrixSum = sum;
                }
            }
        }
        for (int[] num : biggestMatrix) {
            System.out.println();
            for (int n : num) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
        System.out.println(biggestMatrixSum);
    }
}
