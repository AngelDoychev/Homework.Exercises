package JavaAdvance.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(command[0]);
        int col = Integer.parseInt(command[1]);
        int[][] matrix = new int[row][col];
        int[][] biggestMatrix = new int[3][3];
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = currentRow;
        }
        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                int currentSum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                        + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                if (maxSum < currentSum) {
                    biggestMatrix[0][0] = matrix[i][j];
                    biggestMatrix[0][1] = matrix[i][j + 1];
                    biggestMatrix[0][2] = matrix[i][j + 2];
                    biggestMatrix[1][0] = matrix[i + 1][j];
                    biggestMatrix[1][1] = matrix[i + 1][j + 1];
                    biggestMatrix[1][2] = matrix[i + 1][j + 2];
                    biggestMatrix[2][0] = matrix[i + 2][j];
                    biggestMatrix[2][1] = matrix[i + 2][j + 1];
                    biggestMatrix[2][2] = matrix[i + 2][j + 2];
                    maxSum = currentSum;
                }
            }
        }
        System.out.print("Sum = " + maxSum);
        for (int[] number : biggestMatrix) {
            System.out.println();
            for (int num : number) {
                System.out.print(num + " ");
            }
        }
    }
}
