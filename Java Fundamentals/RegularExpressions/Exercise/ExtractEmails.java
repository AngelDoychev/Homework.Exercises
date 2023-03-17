package Fundametals.RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile
                ("[A-Za-z0-9]+[.\\-_]?[A-Za-z0-9]+@[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z]+)+");
        String text = scanner.nextLine();
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
