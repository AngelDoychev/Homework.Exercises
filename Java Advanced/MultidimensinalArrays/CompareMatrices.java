package JavaAdvance.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command1 = scanner.nextLine().split("\\s+");
        int row1 = Integer.parseInt(command1[0]);
        int col1 = Integer.parseInt(command1[1]);
        int[][] matrix1 = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            int[] currentCol = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix1[i] = currentCol;
        }
        String[] command2 = scanner.nextLine().split("\\s+");
        int row2 = Integer.parseInt(command2[0]);
        int col2 = Integer.parseInt(command2[1]);
        int[][] matrix2 = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            int[] currentCol = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix2[i] = currentCol;
        }
        boolean isSame = true;
        if (row1 != row2 || col1 != col2) {
            System.out.println("not equal");
            return;
        } else {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    if (matrix1[i][j] != matrix2[i][j]) {
                        isSame = false;
                    }
                }
            }
        }
        if (isSame) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
