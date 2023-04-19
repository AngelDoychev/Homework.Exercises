package JavaAdvance.SetsAndMapsAdvanced;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, List<String>>> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String continent = command[0];
            String country = command[1];
            String city = command[2];
            if (!map.containsKey(continent)) {
                map.put(continent, new LinkedHashMap<>());
                if (!map.get(continent).containsKey(country)) {
                    map.get(continent).put(country, new ArrayList<>());
                    map.get(continent).get(country).add(city);
                } else {
                    map.get(continent).get(country).add(city);
                }
            } else {
                if (!map.get(continent).containsKey(country)) {
                    map.get(continent).put(country, new ArrayList<>());
                    map.get(continent).get(country).add(city);
                } else {
                    map.get(continent).get(country).add(city);
                }
            }
        }
        for (Map.Entry<String, LinkedHashMap<String, List<String>>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":");
            entry.getValue().entrySet().forEach(e -> System.out.println("  " + e.getKey() + " -> " +
                    String.join(", ", e.getValue())));
        }
    }
}
