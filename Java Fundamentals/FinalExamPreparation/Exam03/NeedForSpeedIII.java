package Fundametals.FinalExamPreparation.Exam03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> carsMileage = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> carsFuel = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split("\\|");
            carsMileage.put(carInfo[0], Integer.parseInt(carInfo[1]));
            carsFuel.put(carInfo[0], Integer.parseInt(carInfo[2]));
        }
        String[] command = scanner.nextLine().split(" : ");
        String car = "";
        int distance = 0;
        int fuel = 0;
        while (!command[0].equals("Stop")) {
            switch (command[0]) {
                case "Drive":
                    car = command[1];
                    distance = Integer.parseInt(command[2]);
                    fuel = Integer.parseInt(command[3]);
                    if (carsFuel.get(car) > fuel) {
                        carsMileage.put(car, carsMileage.get(car) + distance);
                        carsFuel.put(car, carsFuel.get(car) - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    if (carsMileage.get(car) >= 100000) {
                        carsMileage.remove(car);
                        carsFuel.remove(car);
                        System.out.printf("Time to sell the %s!%n", car);
                    }
                    break;
                case "Refuel":
                    car = command[1];
                    fuel = Integer.parseInt(command[2]);
                    if (carsFuel.get(car) + fuel >= 75) {
                        int difference = 75 - carsFuel.get(car) - fuel;
                        carsFuel.put(car, 75);
                        System.out.printf("%s refueled with %d liters%n", car, fuel + difference);
                    } else {
                        carsFuel.put(car, carsFuel.get(car) + fuel);
                        System.out.printf("%s refueled with %d liters%n", car, fuel);
                    }
                    break;
                case "Revert":
                    car = command[1];
                    distance = Integer.parseInt(command[2]);
                    if (carsMileage.get(car) - distance < 10000) {
                        carsMileage.put(car, 10000);
                    } else {
                        carsMileage.put(car, carsMileage.get(car) - distance);
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, distance);
                    }
                    break;
            }
            command = scanner.nextLine().split(" : ");
        }
        for (Map.Entry<String, Integer> entry : carsMileage.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n"
                    , entry.getKey(), entry.getValue(), carsFuel.get(entry.getKey()));
        }
    }
}
