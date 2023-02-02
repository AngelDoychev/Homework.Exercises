package FirstStepsInCoding.Fundamentals.Arrays.MoreExercises;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        pascal(n);
    }

    public static void pascal(int n) {
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
                System.out.print("");
            }
            int C = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
}
