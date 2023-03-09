package Fundametals.TextProcessing;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else if (Character.isLetter(ch)) {
                letters.append(ch);
            } else {
                other.append(ch);
            }
        }
        System.out.printf("%s%n%s%n%s%n", digits, letters, other);
    }
}
