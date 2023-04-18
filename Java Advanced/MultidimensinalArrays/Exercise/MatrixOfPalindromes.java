package JavaAdvance.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] command = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowsInMatrix = command[0];
        int colsInMatrix = command[1];
        String[][] matrix = new String[rowsInMatrix][colsInMatrix];
        for (int i = 0; i < rowsInMatrix; i++) {
            for (int j = 0; j < colsInMatrix; j++) {
                char outside = (char) ('a' + i);
                char inside = (char) ('a' + i + j);
                matrix[i][j] = "" + outside + inside + outside;
            }
        }
        for (String[] palindrome : matrix) {
            System.out.println();
            for (String currentString : palindrome) {
                System.out.print(currentString + " ");
            }
        }
    }
}
