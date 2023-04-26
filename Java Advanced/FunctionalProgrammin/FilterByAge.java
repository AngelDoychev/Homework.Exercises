package JavaAdvance.FunctionalProgramming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        HashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split(", ");
            String name = info[0];
            int age = Integer.parseInt(info[1]);
            map.put(name, age);
        }
        String olderOrYounger = scanner.nextLine();
        int olderOrYoungerThan = Integer.parseInt(scanner.nextLine());
        String printType = scanner.nextLine();
        Consumer<Map.Entry<String, Integer>> printStyle = null;
        if (printType.equals("name")) {
            printStyle = e -> System.out.println(e.getKey());
        } else if (printType.equals("age")) {
            printStyle = e -> System.out.println(e.getValue());
        } else if (printType.equals("name age")) {
            printStyle = e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue());
        }
        if (olderOrYounger.equals("older")) {
            map.entrySet().stream().filter(e -> e.getValue() >= olderOrYoungerThan).forEach(printStyle);

        } else if (olderOrYounger.equals("younger")) {
            map.entrySet().stream().filter(e -> e.getValue() <= olderOrYoungerThan).forEach(printStyle);
        }
    }
}
