package JavaAdvance.SetsAndMapsAdvanced.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String, Integer> scoreMap = new LinkedHashMap<>();
        LinkedHashMap<String, HashSet<String>> map = new LinkedHashMap<>();
        while (!command.equals("JOKER")) {
            String currentName = command.split(": ")[0];
            String currentCards = command.split(": ")[1];
            String[] cards = currentCards.split(", ");
            if (!map.containsKey(currentName)) {
                map.put(currentName, new HashSet<>());
                for (int i = 0; i < cards.length; i++) {
                    map.get(currentName).add(cards[i]);
                }
            } else {
                for (int i = 0; i < cards.length; i++) {
                    map.get(currentName).add(cards[i]);
                }
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, HashSet<String>> entry : map.entrySet()) {
            int scoreOfPerson = 0;
            for (String card : entry.getValue()) {
                int currentScore = 0;
                Pattern pattern = Pattern.compile("(?<power>[0-9]+|[AJQK])(?<type>[SHDC])");
                Matcher matcher = pattern.matcher(card);
                String cardPower = "";
                String cardType = "";
                while (matcher.find()) {
                    cardPower = matcher.group("power");
                    cardType = matcher.group("type");
                }
                if (cardPower.equals("2")) {
                    currentScore += Integer.parseInt(cardPower);
                } else if (cardPower.equals("3")) {
                    currentScore += Integer.parseInt(cardPower);
                } else if (cardPower.equals("4")) {
                    currentScore += Integer.parseInt(cardPower);
                } else if (cardPower.equals("5")) {
                    currentScore += Integer.parseInt(cardPower);
                } else if (cardPower.equals("6")) {
                    currentScore += Integer.parseInt(cardPower);
                } else if (cardPower.equals("7")) {
                    currentScore += Integer.parseInt(cardPower);
                } else if (cardPower.equals("8")) {
                    currentScore += Integer.parseInt(cardPower);
                } else if (cardPower.equals("9")) {
                    currentScore += Integer.parseInt(cardPower);
                } else if (cardPower.equals("10")) {
                    currentScore += Integer.parseInt(cardPower);
                } else if (cardPower.equals("J")) {
                    currentScore += 11;
                } else if (cardPower.equals("Q")) {
                    currentScore += 12;
                } else if (cardPower.equals("K")) {
                    currentScore += 13;
                } else if (cardPower.equals("A")) {
                    currentScore += 14;
                }
                if (cardType.equals("S")) {
                    currentScore *= 4;
                } else if (cardType.equals("H")) {
                    currentScore *= 3;
                } else if (cardType.equals("D")) {
                    currentScore *= 2;
                }
                scoreOfPerson += currentScore;
            }
            if (!scoreMap.containsKey(entry.getKey())) {
                scoreMap.put(entry.getKey(), scoreOfPerson);
            } else {
                scoreMap.put(entry.getKey(), scoreMap.get(entry.getKey()) + scoreOfPerson);
            }
        }
        for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
