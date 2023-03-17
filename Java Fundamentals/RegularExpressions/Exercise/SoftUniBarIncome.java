package Fundametals.RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|.$%]*<(?<item>\\w+)>[^|.$%]*\\|(?<qty>[0-9]+)\\|[^|.$%]*?(?<price>[0-9]+.?[0-9]+)\\$");
        double totalPrice = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                totalPrice += Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("qty"));
                System.out.printf("%s: %s - %.2f%n"
                        , matcher.group("name")
                        , matcher.group("item")
                        , Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("qty")));
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f%n", totalPrice);
    }
}
