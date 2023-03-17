package Fundametals.RegularExpressions.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nameList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        List<String> winnerList = new ArrayList<>();
        LinkedHashMap<String, Integer> raceMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        nameList.forEach(racer -> raceMap.put(racer, 0));
        while (!input.equals("end of race")) {
            int distance = 0;
            String numbers = input.replaceAll("[^0-9]", "");
            for (int i = 0; i < numbers.length(); i++) {
                distance += Integer.parseInt(Character.toString(numbers.charAt(i)));
            }
            input = input.replaceAll("[^A-Za-z]", "");
            if (raceMap.containsKey(input)) {
                raceMap.put(input, raceMap.get(input) + distance);
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.printf("1st place: %s%n", nameList.get(i));
            } else if (i == 1) {
                System.out.printf("2nd place: %s%n", nameList.get(i));
            } else if (i == 2) {
                System.out.printf("3rd place: %s%n", nameList.get(i));
            }
        }
    }
}
