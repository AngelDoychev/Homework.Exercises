package Fundametals.AssociativeArrays;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double, Integer> numMap = new TreeMap<>();
        for (double num : numbers) {
            if (!numMap.containsKey(num)) {
                numMap.put(num, 0);
            }
            numMap.put(num, numMap.get(num) + 1);
        }
        for (Map.Entry<Double, Integer> entry : numMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
