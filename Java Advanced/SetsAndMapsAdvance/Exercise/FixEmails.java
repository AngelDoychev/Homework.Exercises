package JavaAdvance.SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        while (!command.equals("stop")) {
            String currentName = command;
            String currentEmail = scanner.nextLine();
            String test = currentEmail.substring(currentEmail.length() - 2, currentEmail.length());
            String test2 = currentEmail.substring(currentEmail.length() - 3, currentEmail.length());
            if (!currentEmail.substring(currentEmail.length() - 3, currentEmail.length()).equalsIgnoreCase("com")
                    && !currentEmail.substring(currentEmail.length() - 2, currentEmail.length()).equalsIgnoreCase("us")
                    && !currentEmail.substring(currentEmail.length() - 2, currentEmail.length()).equalsIgnoreCase("uk")) {
                map.put(currentName, currentEmail);
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
