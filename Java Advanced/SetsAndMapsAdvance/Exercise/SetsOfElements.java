package JavaAdvance.SetsAndMapsAdvanced.Exercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        int firstSetSize = Integer.parseInt(command[0]);
        int secondSetSize = Integer.parseInt(command[1]);
        LinkedHashSet<String> firstSet = new LinkedHashSet<>();
        LinkedHashSet<String> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < firstSetSize; i++) {
            String currentNum = scanner.nextLine();
            firstSet.add(currentNum);
        }
        for (int i = 0; i < secondSetSize; i++) {
            String currentNum = scanner.nextLine();
            secondSet.add(currentNum);
        }
        firstSet.retainAll(secondSet);
        for (String number : firstSet) {
            if (firstSet.contains(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
