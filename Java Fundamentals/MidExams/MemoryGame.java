package MidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String command = scanner.nextLine();
        int count = 0;
        while (!command.equals("end")) {
            count++;
            String[] input = command.split("\\s+");
            int index1 = Integer.parseInt(input[0]);
            int index2 = Integer.parseInt(input[1]);
            if (cheat(index1, index2, elements)) {
                System.out.println("Invalid input! Adding additional elements to the board");
                elements.add(elements.size() / 2, String.format("-%da", count));
                elements.add(elements.size() / 2, String.format("-%da", count));
            } else {
                String firstElement = elements.get(index1);
                String secondElement = elements.get(index2);
                if (firstElement.equals(secondElement)) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", elements.get(index1));
                    elements.remove(firstElement);
                    elements.remove(secondElement);
                } else {
                    System.out.println("Try again!");
                }
            }
            if (elements.isEmpty()){
                break;
            }
            command = scanner.nextLine();
        }
        if (elements.isEmpty()) {
            System.out.printf("You have won in %d turns!%n", count);
        } else {
            System.out.println("Sorry you lose :(");
            for (String element : elements) {
                System.out.print(element + " ");
            }
        }
    }
    public static boolean cheat(int firstIndex, int secondIndex, List<String> elements) {
        if (firstIndex == secondIndex || isInvalidIndex(firstIndex, elements) || isInvalidIndex(secondIndex, elements)) {
            return true;
        }
        return false;
    }

    public static boolean isInvalidIndex(int index, List<String> elements) {
        if (index < 0 || index >= elements.size()) {
            return true;
        }
        return false;
    }
}