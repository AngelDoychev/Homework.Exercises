package Fundametals.RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> validItems = new ArrayList<>();
        double totalMoneySpent = 0;
        while (!input.equals("Purchase")) {
            Pattern pattern = Pattern.compile(">>(?<item>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                validItems.add(matcher.group("item"));
                int qty = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                totalMoneySpent += qty * price;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        validItems.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f%n", totalMoneySpent);
    }
}
