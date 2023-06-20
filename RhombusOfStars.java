package JavaOOP.WorkingWithAbstraction;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        printTop(size);
        printBottom(size);
    }

    private static void printBottom(int size) {
        for (int i = size - 1; i > 0; i--) {
            printRow(size, i);
        }
    }

    private static void printTop(int size) {
        for (int i = 1; i <= size; i++) {
            printRow(size, i);
        }
    }

    private static void printRow(int size, int i) {
        for (int j = 0; j < size - i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
