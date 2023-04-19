package JavaAdvance.SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, double[]> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String currentName = scanner.nextLine();
            double[] scores = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
            if (!map.containsKey(currentName)) {
                map.put(currentName, new double[scores.length]);
                map.put(currentName, scores);
            } else {
                map.put(currentName, scores);
            }
        }
        map.forEach((k, v) -> {
            double sum = 0;
            for (Double grade : v) {
                sum += grade;
            }
            System.out.println(k + " is graduated with " + sum / v.length);
        });
    }
}
