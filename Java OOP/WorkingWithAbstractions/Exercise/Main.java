package JavaOOP.WorkingWithAbstraction.Exercise.CardSuits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("Card Suits")) {
            System.out.println("Card Suits:");
            for (Suits current : Suits.values()) {
                System.out.printf("Ordinal value: %d; Name value: %s%n", current.ordinal(), current.name());
            }
        }
    }
}
