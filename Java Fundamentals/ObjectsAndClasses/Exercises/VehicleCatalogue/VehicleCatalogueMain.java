package Fundametals.ObjectsAndClasses.Exercises.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogueMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        List<Vehicle> carsList = new ArrayList<>();
        List<Vehicle> trucksList = new ArrayList<>();
        List<Vehicle> vehiclesList = new ArrayList<>();
        String input = "";
        while (!input.equals("Close the Catalogue")) {
            while (!command[0].equals("End")) {
                Vehicle vehicle = new Vehicle(command[0], command[1], command[2], Integer.parseInt(command[3]));
                if (command[0].equals("truck")) {
                    trucksList.add(vehicle);
                    vehiclesList.add(vehicle);
                } else if (command[0].equals("car")) {
                    carsList.add(vehicle);
                    vehiclesList.add(vehicle);
                }

                command = scanner.nextLine().split("\\s+");
            }
            for (int i = 0; i < vehiclesList.size(); i++) {
                Vehicle vehicle = vehiclesList.get(i);
                if (input.equals(vehicle.getModel())) {
                    System.out.print(vehicle);
                }
            }
            input = scanner.nextLine();
        }
        double carsAverageHP = 0;
        for (int i = 0; i < carsList.size(); i++) {
            Vehicle vehicle = carsList.get(i);
            carsAverageHP += vehicle.getHorsePower();
        }
        carsAverageHP = carsAverageHP / carsList.size();
        double trucksAverageHP = 0;
        for (int i = 0; i < trucksList.size(); i++) {
            Vehicle vehicle = trucksList.get(i);
            trucksAverageHP += vehicle.getHorsePower();
        }
        trucksAverageHP = trucksAverageHP / trucksList.size();
        if (carsList.size() == 0) {
            carsAverageHP = 0;
        }
        if (trucksList.size() == 0) {
            trucksAverageHP = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%nTrucks have average horsepower of: %.2f.",
                carsAverageHP, trucksAverageHP);
    }
}
