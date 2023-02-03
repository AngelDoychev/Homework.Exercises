package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch1 = scanner.nextLine().charAt(0);
        char ch2 = scanner.nextLine().charAt(0);
        biggerChar(ch1, ch2);
    }

    public static void biggerChar(char ch1, char ch2) {
        if (ch1 > ch2) {
            int newChar = ch2;
            for (int i = ch2; i < ch1 - 1; i++) {
                newChar = newChar + 1;
                System.out.print((char) newChar + " ");
            }
        } else {
            charPrinter(ch1, ch2);
        }
    }

    public static void charPrinter(char ch1, char ch2) {
        int newChar = ch1;
        for (int i = ch1; i < ch2 - 1; i++) {
            newChar = newChar + 1;
            System.out.print((char) newChar + " ");
        }
    }
}
