package JavaAdvance.MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(", ");
        int n = Integer.parseInt(command[0]);
        String type = command[1];
        int[][] matrix = new int[n][n];
        switch (type) {
            case "A":
                int countRow = 1;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        matrix[j][i] = countRow++;
                    }
                }
                break;
            case "B":
                int countRow2 = 1;
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        for (int j = 0; j < n; j++) {
                            matrix[j][i] = countRow2++;
                        }
                    } else {
                        for (int j = n - 1; j >= 0; j--) {
                            matrix[j][i] = countRow2++;
                        }
                    }
                }
                break;
        }
        for (int[] number : matrix) {
            System.out.println();
            for (int num : number) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
