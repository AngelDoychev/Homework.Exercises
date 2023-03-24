package Fundametals.FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int totalCalories = 0;
        StringBuilder itemsText = new StringBuilder();
        Pattern pattern = Pattern.compile("(#|\\|)(?<product>[A-Za-z ]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>\\d+)\\1");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            if (Integer.parseInt(matcher.group("calories")) > 10000 || Integer.parseInt(matcher.group("calories")) < 0) {
                continue;
            }
            totalCalories += Integer.parseInt(matcher.group("calories"));
            String temp = String.format("Item: %s, Best before: %s, Nutrition: %s%n"
                    , matcher.group("product"), matcher.group("date"), matcher.group("calories"));
            itemsText.append(temp);
        }

        System.out.printf("You have food to last you for: %d days!%n", totalCalories / 2000);
        System.out.println(itemsText);
    }
}
