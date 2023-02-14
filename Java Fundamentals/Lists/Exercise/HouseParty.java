package Fundametals.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ;
        List<String> guests = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            if (command.contains("not")) {
                String newGuest = command.split("\\s+")[0];
                if (guests.contains(newGuest)) {
                    guests.remove(newGuest);
                } else {
                    System.out.printf("%s is not in the list!%n", newGuest);
                }
            } else {
                String newGuest = command.split("\\s+")[0];
                if (guests.contains(newGuest)) {
                    System.out.printf("%s is already in the list!%n", newGuest);
                } else {
                    guests.add(0, newGuest);

                }
            }
        }
        for (String guest : guests) {
            System.out.print(guest + " ");
        }
    }
}
