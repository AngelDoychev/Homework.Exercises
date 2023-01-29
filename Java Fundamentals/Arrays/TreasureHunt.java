package FirstStepsInCoding.Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] initialLootArr = scanner.nextLine().split("\\|");
        String[] command = scanner.nextLine().split(" ");
        double treasureGain = 0;
        boolean flag = false;
        int itemsCount = initialLootArr.length;
        while (!command[0].equals("Yohoho!")) {
            switch (command[0]) {
                case "Loot":
                    for (int i = 1; i < command.length; i++) {
                        boolean alreadyContained = false;
                        for (int j = 0; j < initialLootArr.length; j++) {
                            if (command[i].equals(initialLootArr[j])) {
                                alreadyContained = true;
                                break;
                            }
                        }
                        if (!alreadyContained) {
                            String newChest = command[i] + " " + String.join(" ", initialLootArr);
                            initialLootArr = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int drop = Integer.parseInt(command[1]);
                    if (drop >= initialLootArr.length - 1 || drop < 0) {
                        break;
                    } else {
                        String currentLoot = initialLootArr[drop];
                        for (int i = drop; i < initialLootArr.length - 1; i++) {
                            initialLootArr[i] = initialLootArr[i + 1];
                        }
                        initialLootArr[initialLootArr.length - 1] = currentLoot;
                    }
                    break;
                case "Steal":
                    int numberOfStealingItems = Integer.parseInt(command[1]);

                    if (numberOfStealingItems >= 0 && numberOfStealingItems < initialLootArr.length) {
                        for (int i = 0; i < numberOfStealingItems; i++) {
                            System.out.print(initialLootArr[initialLootArr.length - numberOfStealingItems + i]);
                            if (i != numberOfStealingItems - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] tempChest = new String[initialLootArr.length - numberOfStealingItems];
                        for (int i = 0; i < tempChest.length; i++) {
                            tempChest[i] = initialLootArr[i];
                        }
                        initialLootArr = tempChest;

                    } else if (numberOfStealingItems >= 0) {
                        for (int i = 0; i < initialLootArr.length; i++) {
                            System.out.print(initialLootArr[i]);
                            if (i != initialLootArr.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        initialLootArr = new String[0];
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine().split(" ");
        }
        String treasureCount = String.join("", initialLootArr);
        int count = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            count++;
        }
        for (int i = 0; i < initialLootArr.length; i++) {
            treasureGain += initialLootArr[i].length();
        }
        treasureGain = count * 1.0 / initialLootArr.length;
        if (count > 0) {

            System.out.printf("Average treasure gain: %.2f pirate credits.", treasureGain);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
