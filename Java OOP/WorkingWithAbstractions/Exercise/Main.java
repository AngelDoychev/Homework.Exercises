package JavaOOP.WorkingWithAbstraction.Exercise.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cardNumber = scanner.nextLine();
        String cardSuit = scanner.nextLine();
        System.out.printf("Card name: %s of %s; Card power: %d%n"
                , Ranks.valueOf(cardNumber), Suits.valueOf(cardSuit)
                , Ranks.valueOf(cardNumber).getPower() + Suits.valueOf(cardSuit).getPower());
    }
}
