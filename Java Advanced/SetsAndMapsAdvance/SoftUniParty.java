package JavaAdvance.SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currentGuest = scanner.nextLine();
        Set<String> guestList = new TreeSet<>();
        while (!currentGuest.equals("PARTY")) {
            guestList.add(currentGuest);
            currentGuest = scanner.nextLine();
        }
        while (!currentGuest.equals("END")) {
            guestList.remove(currentGuest);
            currentGuest = scanner.nextLine();
        }
        System.out.println(guestList.size());
        for (String guest : guestList) {
            System.out.println(guest);
        }
    }
}
