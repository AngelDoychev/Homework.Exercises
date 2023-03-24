package Fundametals.FinalExamPreparation.Exam02;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> plantsMap = new LinkedHashMap<>();
        LinkedHashMap<String, ArrayList<Double>> ratingsMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String currentPlant = scanner.nextLine();
            String plant = currentPlant.split("<->")[0];
            int rarity = Integer.parseInt(currentPlant.split("<->")[1]);
            plantsMap.put(plant, rarity);
            ratingsMap.put(plant, new ArrayList<>());
        }
        String[] input = scanner.nextLine().split(": ");
        while (!input[0].equals("Exhibition")) {
            String[] command = input[1].split(" - ");
            if (plantsMap.containsKey(command[0])) {
                switch (input[0]) {
                    case "Rate":
                        ratingsMap.get(command[0]).add(Double.parseDouble(command[1]));
                        break;
                    case "Update":
                        if (plantsMap.containsKey(command[0])) {
                            plantsMap.put(command[0], Integer.parseInt(command[1]));
                        }
                        break;
                    case "Reset":
                        if (plantsMap.containsKey(command[0])) {
                            ratingsMap.get(command[0]).clear();
                        }
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            } else {
                System.out.println("error");
            }
            input = scanner.nextLine().split(": ");
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantsMap.entrySet()) {
            double totalRating = ratingsMap.get(entry.getKey()).stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n"
                    , entry.getKey(), entry.getValue(), totalRating);

        }
    }
}
