package Fundametals.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Double> studentsMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!studentsMap.containsKey(name)) {
                studentsMap.put(name, grade);
            } else {
                studentsMap.put(name, (grade + studentsMap.get(name)) / 2);
            }
        }
        studentsMap.entrySet().stream().filter(w -> w.getValue() >= 4.50)
                .forEach(w -> System.out.println(w.getKey() + " -> " + String.format("%.2f", w.getValue())));
    }
}
