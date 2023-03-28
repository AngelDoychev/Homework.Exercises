package Fundametals.FinalExamPreparation.Exam04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            Pattern pattern = Pattern.compile("(@#+)(?<word>[A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)");
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                String productGroup = "";
                for (int j = 0; j < matcher.group("word").length(); j++) {
                    if (Character.isDigit(matcher.group("word").charAt(j))) {
                        productGroup += matcher.group("word").charAt(j);
                    }
                }
                if (productGroup.isEmpty()) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", productGroup);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
