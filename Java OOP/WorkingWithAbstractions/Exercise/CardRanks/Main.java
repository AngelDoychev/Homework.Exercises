package JavaOOP.WorkingWithAbstraction.Exercise.CardRanks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("Card Ranks")) {
            System.out.println("Card Ranks:");
            for (Ranks current : Ranks.values()) {
                System.out.printf("Ordinal value: %d; Name value: %s%n", current.ordinal(), current.name());
            }
        }
    }
}
