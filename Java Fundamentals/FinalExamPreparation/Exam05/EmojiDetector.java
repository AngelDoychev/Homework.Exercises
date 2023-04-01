package Fundametals.FinalExamPreparation.Exam05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String numbersOnly = text.replaceAll("[^0-9]", "");
        long coolThreshold = 1;
        for (int i = 0; i < numbersOnly.length(); i++) {
            coolThreshold *= Integer.parseInt(Character.toString(numbersOnly.charAt(i)));
        }
        Pattern pattern = Pattern.compile("(::|\\*\\*)(?<word>[A-Z][a-z]{2,})\\1");
        Matcher matcher = pattern.matcher(text);
        List<String> coolEmojis = new ArrayList<>();
        int count = 0;
        while (matcher.find()) {
            count++;
            int coolness = 0;
            for (int i = 0; i < matcher.group("word").length(); i++) {
                coolness += matcher.group("word").charAt(i);
            }
            if (coolness > coolThreshold) {
                coolEmojis.add(matcher.group());
            }
        }
        System.out.printf("Cool threshold: %d%n%d emojis found in the text. The cool ones are:%n", coolThreshold, count);
        for (String emoji : coolEmojis) {
            System.out.println(emoji);
        }
    }
}
