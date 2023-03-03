package Fundametals.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String, Long> resourcesMap = new LinkedHashMap<>();
        while (!command.equals("stop")) {
            long qty = Long.parseLong(scanner.nextLine());
            if (resourcesMap.containsKey(command)) {
                resourcesMap.put(command, resourcesMap.get(command) + qty);
            } else {
                resourcesMap.put(command, qty);
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Long> entry : resourcesMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
