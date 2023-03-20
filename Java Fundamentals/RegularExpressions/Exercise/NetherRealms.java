package Fundametals.RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] demons = scanner.nextLine().split("[,\\s+]+");
        for (int index = 0; index < demons.length; index++) {
            double sumHealth = 0;
            String currentDemon = demons[index];
            String currentDemonTemp = currentDemon.replaceAll("[-+0-9*/.]", "");
            for (int i = 0; i < currentDemonTemp.length(); i++) {
                char ch = currentDemonTemp.charAt(i);
                sumHealth += ch;
            }
            Pattern numbersInInput = Pattern.compile("(?<num>(-|\\+)?([0-9]+\\.?[0-9]*))");
            Matcher numberInInput = numbersInInput.matcher(currentDemon);
            double baseDamage = 0;
            while (numberInInput.find()) {
                baseDamage += Double.parseDouble(numberInInput.group("num"));
            }
            Pattern patternMultiply = Pattern.compile("(?<num>\\*)");
            Matcher matcherMultiply = patternMultiply.matcher(currentDemon);

            while (matcherMultiply.find()) {
                baseDamage *= 2;
            }
            Pattern patternDivide = Pattern.compile("(?<num>\\/)");
            Matcher matcherDivide = patternDivide.matcher(currentDemon);
            while (matcherDivide.find()) {
                baseDamage /= 2;
            }
            System.out.printf("%s - %.0f health, %.2f damage%n", currentDemon, sumHealth, baseDamage);
        }
    }
}
