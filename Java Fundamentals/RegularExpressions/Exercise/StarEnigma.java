package Fundametals.RegularExpressions.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanetsList = new ArrayList<>();
        List<String> destroyedPlanetsList = new ArrayList<>();
        Pattern pattern = Pattern.compile("[^@\\-!:>]*@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>[\\d]+)[^@\\-!:>]*!(?<type>[AD])![^@\\-!:>]*->(?<soldiers>[\\d]+)");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            StringBuilder sb = new StringBuilder();
            int key = input.replaceAll("[^sStTaArR]", "").length();
            for (int j = 0; j < input.length(); j++) {
                char newLetter = (char) (input.charAt(j) - key);
                sb.append(newLetter);
            }
            Matcher matcher = pattern.matcher(sb.toString());
            String planet = "";
            String type = "";
            if (matcher.find()) {
                planet = matcher.group("planet");
                type = matcher.group("type");
            }
            if (type.equals("A")) {
                attackedPlanetsList.add(planet);
            } else if (type.equals("D")) {
                destroyedPlanetsList.add(planet);
            }
        }
        Collections.sort(attackedPlanetsList);
        Collections.sort(destroyedPlanetsList);
        System.out.println("Attacked planets: " + attackedPlanetsList.size());
        for (String planet : attackedPlanetsList) {
            System.out.println("-> " + planet);
        }
        System.out.println("Destroyed planets: " + destroyedPlanetsList.size());
        for (String planet : destroyedPlanetsList) {
            System.out.println("-> " + planet);
        }
    }
}
