package Fundametals.TextProcessing.Exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int newCh = text.charAt(i) + 3;
            newText.append((char) newCh);
        }
        System.out.println(newText);
    }
}
