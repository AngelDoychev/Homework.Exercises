package Fundametals.RegularFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("\\|(?<boss>[A-Z]{4,})\\|:#(?<title>[A-Za-z]+ [A-Za-z]+)#");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.printf("%s, The %s%n>> Strength: %d%n>> Armor: %d%n"
                        , matcher.group("boss")
                        , matcher.group("title")
                        , matcher.group("boss").length()
                        , matcher.group("title").length());
            } else {
                System.out.println("Access denied!");
            }
        }
    }
}
