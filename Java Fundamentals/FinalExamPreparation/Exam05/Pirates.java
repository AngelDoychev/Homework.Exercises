package Fundametals.FinalExamPreparation.Exam05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|\\|");
        LinkedHashMap<String, Integer> population = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> gold = new LinkedHashMap<>();
        while (!input[0].equals("Sail")) {
            String currentCity = input[0];
            int currentPopulation = Integer.parseInt(input[1]);
            int currentGold = Integer.parseInt(input[2]);
            if (!gold.containsKey(currentCity)) {
                population.put(currentCity, currentPopulation);
                gold.put(currentCity, currentGold);
            } else {
                population.put(currentCity, population.get(currentCity) + currentPopulation);
                gold.put(currentCity, gold.get(currentCity) + currentGold);
            }
            input = scanner.nextLine().split("\\|\\|");
        }
        String[] command = scanner.nextLine().split("=>");
        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "Plunder":
                    String plunderedTown = command[1];
                    int plunderedPeople = Integer.parseInt(command[2]);
                    int plunderedGold = Integer.parseInt(command[3]);
                    population.put(plunderedTown, population.get(plunderedTown) - plunderedPeople);
                    gold.put(plunderedTown, gold.get(plunderedTown) - plunderedGold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", plunderedTown, plunderedGold, plunderedPeople);
                    if (population.get(plunderedTown) <= 0 || gold.get(plunderedTown) <= 0) {
                        population.remove(plunderedTown);
                        gold.remove(plunderedTown);
                        System.out.printf("%s has been wiped off the map!%n", plunderedTown);
                    }
                    break;
                case "Prosper":
                    String prosperingTown = command[1];
                    int prosperingGold = Integer.parseInt(command[2]);
                    if (prosperingGold > 0) {
                        gold.put(prosperingTown, gold.get(prosperingTown) + prosperingGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", prosperingGold, prosperingTown, gold.get(prosperingTown));
                    } else {
                        System.out.println("Gold added cannot be a negative number!");
                    }
                    break;
            }
            command = scanner.nextLine().split("=>");
        }
        if (gold.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", gold.size());
            for (Map.Entry<String, Integer> entry : gold.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), population.get(entry.getKey()), entry.getValue());
            }

        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
