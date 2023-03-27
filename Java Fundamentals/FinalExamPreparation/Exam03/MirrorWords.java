package Fundametals.FinalExamPreparation.Exam03;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("(@|#)(?<word1>[A-Za-z][A-Za-z][A-Za-z]+)\\1\\1(?<word2>[A-Za-z][A-Za-z][A-Za-z]+)\\1");
        Matcher matcher = pattern.matcher(text);
        ArrayList<String> mirroredWords = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        int matcherFound = 0;
        while (matcher.find()) {
            StringBuilder word2 = new StringBuilder(matcher.group("word2"));
            matcherFound++;
            if (matcher.group("word1").equals(word2.reverse().toString())) {
                words.add(matcher.group("word1"));
                mirroredWords.add(matcher.group("word2"));
            }
        }
        if (matcherFound == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", matcherFound);
        }
        if (mirroredWords.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            for (int i = 0; i < words.size() - 1; i++) {
                System.out.printf("%s <=> %s, ", words.get(i), mirroredWords.get(i));
            }
            System.out.printf("%s <=> %s%n", words.get(words.size() - 1), mirroredWords.get(mirroredWords.size() - 1));
        }
    }
}
