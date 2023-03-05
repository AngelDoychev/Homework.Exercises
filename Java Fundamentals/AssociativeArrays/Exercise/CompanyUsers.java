package Fundametals.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(" -> ");
        LinkedHashMap<String, LinkedHashMap<String, String>> companyMap = new LinkedHashMap<>();
        String companyName = "";
        String employee = "";
        while (!command[0].equals("End")) {
            companyName = command[0];
            employee = command[1];
            if (!companyMap.containsKey(companyName)) {
                companyMap.put(companyName, new LinkedHashMap<>());
                if (!companyMap.get(companyName).containsKey(companyName)) {
                    companyMap.get(companyName).put(employee, "temp");
                }
            } else {
                companyMap.get(companyName).put(employee, "temp");
            }
            command = scanner.nextLine().split(" -> ");
        }
        for (Map.Entry<String, LinkedHashMap<String, String>> entry : companyMap.entrySet()) {
            System.out.println(entry.getKey());
            for (String employee1 : entry.getValue().keySet()) {
                System.out.printf("-- %s%n", employee1);
            }

        }

    }
}
