package Fundametals.TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (int i = 0; i < bannedWords.length; i++) {
            String toBeReplaced = bannedWords[i];
            String replacement = returnWord(bannedWords[i].length()).toString();
            while (text.contains(bannedWords[i])) {
                text = text.replace(toBeReplaced, replacement);
            }
        }
        System.out.println(text);
    }

    public static StringBuilder returnWord(int n) {
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < n; i++) {
            newWord.append("*");
        }
        return newWord;
    }
}
