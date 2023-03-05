package Fundametals.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(" : ");
        LinkedHashMap<String, LinkedHashMap<String, Integer>> courseMap = new LinkedHashMap<>();
        while (!command[0].equals("end")) {
            String temp = command[0];
            if (!courseMap.containsKey(temp)) {
                courseMap.put(temp, new LinkedHashMap<>());
            }
            if (!courseMap.get(temp).containsKey(command[1])) {
                courseMap.get(command[0]).put(command[1], 0);
            }
            courseMap.get(temp).put(command[1], courseMap.get(temp).get(command[1]) + 1);
            command = scanner.nextLine().split(" : ");
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : courseMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            for (String a : entry.getValue().keySet())
                System.out.printf("-- %s%n", a);
        }
    }
}
