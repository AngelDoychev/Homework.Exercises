package Fundametals.TextProcessing.Exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        String word1 = command[0];
        String word2 = command[1];
        String biggerWord = "";
        if (word1.length() > word2.length()) {
            biggerWord = word1;
        } else if (word2.length() > word1.length()) {
            biggerWord = word2;
        }
        int sum = 0;
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            sum += word1.charAt(i) * word2.charAt(i);
        }
        if (word1.length() != word2.length()) {
            for (int i = Math.max(word1.length(), word2.length()) - 1; i >= Math.min(word1.length(), word2.length()); i--) {
                sum += biggerWord.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
