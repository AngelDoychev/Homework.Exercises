package JavaAdvance.MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[row][col];
        for (int i = 0; i < row; i++) {
            String[] character = scanner.nextLine().split("\\s+");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = character[j];
            }
        }
        String[][] matrix2 = new String[row][col];
        for (int i = 0; i < row; i++) {
            String[] character = scanner.nextLine().split("\\s+");
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = character[j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!matrix[i][j].equals(matrix2[i][j])) {
                    matrix[i][j] = matrix[i][j].replace(matrix[i][j].charAt(0), '*');
                }
            }
        }
        for (String[] ch : matrix) {
            System.out.println();
            for (String c : ch) {
                System.out.print(c + " ");
            }
        }
    }
}
