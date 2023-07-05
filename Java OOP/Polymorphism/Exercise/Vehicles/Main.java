package JavaOOP.Polymorphism.Exercise.Vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInfo = scanner.nextLine().split("\\s+");
        Map<String, Vehicle> vehiclesMap = new LinkedHashMap<>();
        Vehicle car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]));
        vehiclesMap.put("Car", car);
        String[] truckInfo = scanner.nextLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]));
        vehiclesMap.put("Truck", truck);
        int actions = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < actions; i++) {
            String[] currentAction = scanner.nextLine().split("\\s+");
            switch (currentAction[0]) {
                case "Drive":
                    System.out.println(vehiclesMap.get(currentAction[1]).drive(Double.parseDouble(currentAction[2])));
                    break;
                case "Refuel":
                    vehiclesMap.get(currentAction[1]).refuel(Double.parseDouble(currentAction[2]));
                    break;
            }
        }
        vehiclesMap.values().forEach(System.out::println);
    }
}
