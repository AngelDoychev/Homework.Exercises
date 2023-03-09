package Fundametals.AssociativeArrays.Exercise;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("-");
        LinkedHashMap<String, List<String>> studentsMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> languagesList = new LinkedHashMap<>();
        while (!command[0].equals("exam finished")) {
            String name = command[0];
            if (command[1].equals("banned")) {
                for (Map.Entry<String, List<String>> entry : studentsMap.entrySet()) {
                    if (entry.getKey().equals(name)) {
                        entry.getValue().set(1, "-1");
                    }
                }
                command = scanner.nextLine().split("-");
                continue;
            }
            String language = command[1];
            if (!languagesList.containsKey(language)) {
                languagesList.put(language, 0);
            }
            languagesList.put(language, languagesList.get(language) + 1);
            String points = command[2];
            if (!studentsMap.containsKey(name)) {
                studentsMap.put(name, new ArrayList<>());
                studentsMap.get(name).add(language);
                studentsMap.get(name).add(points);
            }
            command = scanner.nextLine().split("-");
        }
        System.out.println("Results:");
        for (Map.Entry<String, List<String>> entry : studentsMap.entrySet()) {
            if (Integer.parseInt(entry.getValue().get(1)) > -1) {
                System.out.printf("%s | %s%n", entry.getKey(), entry.getValue().get(1));
            }
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : languagesList.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }
    }
}