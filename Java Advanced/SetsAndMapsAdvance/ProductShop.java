package JavaAdvance.SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(", ");
        TreeMap<String, LinkedHashMap<String, Double>> map = new TreeMap<>();
        while (!command[0].equals("Revision")) {
            String currentStore = command[0];
            String currentProduct = command[1];
            double currentProductPrice = Double.parseDouble(command[2]);
            if (!map.containsKey(currentStore)) {
                map.put(currentStore, new LinkedHashMap<>());
                if (!map.get(currentStore).containsKey(currentProduct)) {
                    map.get(currentStore).put(currentProduct, currentProductPrice);
                }
            } else {
                map.get(currentStore).put(currentProduct, currentProductPrice);
            }
            command = scanner.nextLine().split(", ");
        }
        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->");
            for (Map.Entry<String, Double> innerEntry : map.get(entry.getKey()).entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", innerEntry.getKey(), innerEntry.getValue());
            }
        }
    }
}
