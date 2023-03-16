package Fundametals.RegularExpressions;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b");
        Matcher matcher = pattern.matcher(text);
        LinkedList<String> validPhoneNumbers = new LinkedList<>();
        while (matcher.find()) {
            validPhoneNumbers.add(matcher.group());
        }
        System.out.println(String.join(", ", validPhoneNumbers));
    }
}
