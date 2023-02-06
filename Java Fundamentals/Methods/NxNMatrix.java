package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            rowFromMatrix(n);
            System.out.println();
        }
    }
    public static void rowFromMatrix(int n){
        for (int j = 0; j < n; j++) {
            System.out.print(n + " ");
        }
    }
}
