package JavaAdvance.SetsAndMapsAdvanced.Exercise;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] info = scanner.nextLine().split("-");
        HashMap<String, String> map = new HashMap<>();
        while (!info[0].equals("search")) {
            String currentName = info[0];
            String currentNumber = info[1];
            map.put(currentName, currentNumber);
            info = scanner.nextLine().split("-");
        }
        String searchName = scanner.nextLine();
        while (!searchName.equals("stop")) {
            if (map.containsKey(searchName)) {
                System.out.printf("%s -> %s%n", searchName, map.get(searchName));
            } else {
                System.out.printf("Contact %s does not exist.%n", searchName);
            }
            searchName = scanner.nextLine();
        }
    }
}
