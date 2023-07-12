package JavaOOP.ExceptionsAndErrorHandling;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] range = scanner.nextLine().split("\\s+");
        int minRange = Integer.parseInt(range[0]);
        int maxRange = Integer.parseInt(range[1]);
        System.out.printf("Range: [%d...%d]\n", minRange, maxRange);
        int number = checkIfNumberIsInRange(minRange, maxRange, scanner);
        System.out.println("Valid number: " + number);
    }

    private static int checkIfNumberIsInRange(int minRange, int maxRange, Scanner scanner) {
        String input = scanner.nextLine();
        while (true) {
            try {
                int number = Integer.parseInt(input);
                if (number >= minRange && number <= maxRange) {
                    return number;
                }
            } catch (NumberFormatException e) {
            }
            System.out.println("Invalid number: " + input);
            input = scanner.nextLine();
        }
    }
}
