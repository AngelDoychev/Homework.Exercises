package Fundametals.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> carMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]) {
                case "register":
                    if (!carMap.containsKey(command[1])) {
                        carMap.put(command[1], command[2]);
                        System.out.printf("%s registered %s successfully%n", command[1], command[2]);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", command[2]);
                    }
                    break;
                case "unregister":
                    if (!carMap.containsKey(command[1])) {
                        System.out.printf("ERROR: user %s not found%n", command[1]);
                    } else {
                        carMap.remove(command[1]);
                        System.out.printf("%s unregistered successfully%n", command[1]);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : carMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
