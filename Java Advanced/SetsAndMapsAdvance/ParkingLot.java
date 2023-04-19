package JavaAdvance.SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(", ");
        Set<String> parkingLotSet = new LinkedHashSet<>();
        while (!command[0].equals("END")) {
            switch (command[0]) {
                case "IN":
                    parkingLotSet.add(command[1]);
                    break;
                case "OUT":
                    parkingLotSet.remove(command[1]);
                    break;
            }
            command = scanner.nextLine().split(", ");
        }
        if (parkingLotSet.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : parkingLotSet) {
                System.out.println(car);
            }
        }
    }
}
