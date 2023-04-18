package JavaAdvance.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        String[][] matrix = new String[row][col];
        for (int i = 0; i < row; i++) {
            String[] currentRow = scanner.nextLine().split("\\s+");
            matrix[i] = currentRow;
        }
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("END")) {
            if (command.length != 5) {
                System.out.println("Invalid input!");
                command = scanner.nextLine().split("\\s+");
                continue;
            }
            if (command[0].equals("swap")) {
                if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) < matrix.length
                        && Integer.parseInt(command[3]) >= 0 && Integer.parseInt(command[3]) < matrix.length
                        && Integer.parseInt(command[2]) >= 0 && Integer.parseInt(command[2]) < col
                        && Integer.parseInt(command[4]) >= 0 && Integer.parseInt(command[4]) < col) {
                    int toBeSwappedRow = Integer.parseInt(command[1]);
                    int toBeSwappedCol = Integer.parseInt(command[2]);
                    int swappedWithRow = Integer.parseInt(command[3]);
                    int swappedWithCol = Integer.parseInt(command[4]);
                    String temp = matrix[toBeSwappedRow][toBeSwappedCol];
                    matrix[toBeSwappedRow][toBeSwappedCol] = matrix[swappedWithRow][swappedWithCol];
                    matrix[swappedWithRow][swappedWithCol] = temp;
                    for (int i = 0; i < row; i++) {
                        if (i == 0) {
                        } else {
                            System.out.println();
                        }
                        for (int j = 0; j < col; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                    }
                    System.out.println();
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine().split("\\s+");
        }
    }
}
