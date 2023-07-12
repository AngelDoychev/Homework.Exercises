package JavaOOP.ExceptionsAndErrorHandling;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        checkIfNumberIsValid(input);
    }

    private static void checkIfNumberIsValid(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.printf("%.2f%n", Math.sqrt(number));
        } catch (NumberFormatException ex) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }
}
