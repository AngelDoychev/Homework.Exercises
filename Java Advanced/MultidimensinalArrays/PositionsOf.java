package JavaAdvance.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rowsAndCols = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] currentCol = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = currentCol;
        }
        int neededNumber = Integer.parseInt(scanner.nextLine());
        boolean hasNum = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == neededNumber) {
                    hasNum = true;
                    System.out.printf("%d %d%n", i, j);
                }
            }
        }
        if (!hasNum) {
            System.out.println("not found");
        }
    }
}
