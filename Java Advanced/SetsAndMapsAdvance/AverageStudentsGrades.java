package JavaAdvance.SetsAndMapsAdvanced;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String currentName = command[0];
            double currentGrade = Double.parseDouble(command[1]);
            if (!map.containsKey(currentName)) {
                map.put(currentName, new ArrayList<>());
                map.get(currentName).add(currentGrade);
            } else {
                map.get(currentName).add(currentGrade);
            }
        }
        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            double avg = 0;
            System.out.print(entry.getKey() + " -> ");

            for (Double number : entry.getValue()) {
                avg += number;
                System.out.printf("%.2f ", number);
            }
            avg /= entry.getValue().size();
            System.out.printf("(avg: %.2f)%n", avg);
        }
    }
}
