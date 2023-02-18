package MidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialHealth = 100;
        int initialBitcoins = 0;
        int bestRoom = 0;
        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        for (int i = 0; i < rooms.size(); i++) {
            List<String> command = Arrays.stream(rooms.get(i).split("\\s+")).collect(Collectors.toList());
            if (command.contains("potion")) {
                int heal = Integer.parseInt(command.get(1));
                if (initialHealth < 100) {
                    initialHealth += heal;
                    if (initialHealth > 100) {
                        heal = 100 - initialHealth + heal;
                        initialHealth = 100;
                    }
                    System.out.printf("You healed for %d hp.%n", heal);
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                }
            } else if (command.contains("chest")) {
                int bitcoinsFound = Integer.parseInt(command.get(1));
                initialBitcoins += bitcoinsFound;
                System.out.printf("You found %d bitcoins.%n", bitcoinsFound);
            } else {
                String monster = command.get(0);
                int attack = Integer.parseInt(command.get(1));
                initialHealth -= attack;
                if (initialHealth <= 0) {
                    System.out.printf("You died! Killed by %s.%n", monster);
                    bestRoom = i + 1;
                    break;
                } else {
                    System.out.printf("You slayed %s.%n", monster);
                }
            }
        }
        if (initialHealth <= 0) {
            System.out.printf("Best room: %d", bestRoom);
        } else {
            System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d%n", initialBitcoins, initialHealth);
        }
    }
}
