package Fundametals.TextProcessing.Exercise;

import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordSamples = scanner.nextLine().split("\\s+");
        ArrayList<Character> alphabetPosition = new ArrayList<Character>(
                Arrays.asList('0', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                        'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));
        double result = 0;
        for (int i = 0; i < wordSamples.length; i++) {
            String currentWord = wordSamples[i];
            char firstLetter = currentWord.charAt(0);
            char secondLetter = '0';
            long number = Integer.parseInt(currentWord.replaceAll("[^0-9]", ""));
            for (int j = 1; j < currentWord.length(); j++) {
                char ch = currentWord.charAt(j);
                if (Character.isLetter(ch)) {
                    secondLetter = ch;
                }
            }
            double currentSum = 0;
            if (Character.isUpperCase(firstLetter)) {
                currentSum = number * 1.0 / alphabetPosition.indexOf(Character.toUpperCase(firstLetter));
            } else {
                currentSum = number * alphabetPosition.indexOf(Character.toUpperCase(firstLetter));
            }
            if (Character.isUpperCase(secondLetter)) {
                currentSum -= alphabetPosition.indexOf(Character.toUpperCase(secondLetter));
            } else {
                currentSum += alphabetPosition.indexOf(Character.toUpperCase(secondLetter));
            }
            result += currentSum;
        }
        System.out.printf("%.2f", result);
    }
}
