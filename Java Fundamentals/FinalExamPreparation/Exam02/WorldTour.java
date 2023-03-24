package Fundametals.FinalExamPreparation.Exam02;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String places = scanner.nextLine();
        String[] command = scanner.nextLine().split(":");
        StringBuilder newPlaces = new StringBuilder(places);
        while (!command[0].equals("Travel")) {
            switch (command[0]) {
                case "Add Stop":
                    if (Integer.parseInt(command[1]) <= places.length() && Integer.parseInt(command[1]) >= 0) {
                        newPlaces.insert(Integer.parseInt(command[1]), command[2]);
                    }
                    System.out.println(newPlaces);
                    break;
                case "Remove Stop":
                    if (Integer.parseInt(command[1]) <= places.length() && Integer.parseInt(command[2]) <= places.length() && Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[2]) >= 0) {
                        newPlaces.replace(Integer.parseInt(command[1]), Integer.parseInt(command[2]) + 1, "");
                    }
                    System.out.println(newPlaces);
                    break;
                case "Switch":
                    if (newPlaces.toString().contains(command[1])) {
                        newPlaces = new StringBuilder(newPlaces.toString().replace(command[1], command[2]));
                    }
                    System.out.println(newPlaces);
                    break;
                default:
                    System.out.println(newPlaces);
                    break;
            }
            command = scanner.nextLine().split(":");
        }
        System.out.printf("Ready for world tour! Planned stops: %s", newPlaces);
    }
}
