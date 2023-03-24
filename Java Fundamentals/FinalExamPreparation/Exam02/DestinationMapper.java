package Fundametals.FinalExamPreparation.Exam02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("(=|\\/)(?<destination>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(text);
        int travelPoints = 0;
        StringBuilder allDestinations = new StringBuilder();
        while (matcher.find()) {
            travelPoints += matcher.group("destination").length();
            allDestinations.append(matcher.group("destination"));
            allDestinations.append(", ");
        }
        if (allDestinations.length() > 0) {
            allDestinations = new StringBuilder(allDestinations.replace(allDestinations.lastIndexOf(", "), allDestinations.length(), ""));
        }
        System.out.printf("Destinations: %s%nTravel Points: %d%n", allDestinations, travelPoints);
    }
}
