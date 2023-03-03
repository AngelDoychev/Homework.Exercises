package Fundametals.AssociativeArrays.Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        LinkedHashMap<String, ArrayList<Double>> productMap = new LinkedHashMap<>();
        while (!command[0].equals("buy")) {
            String product = command[0];
            double price = Double.parseDouble(command[1]);
            double qty = Double.parseDouble(command[2]);
            ArrayList<Double> tempList = new ArrayList<>();
            tempList.add(price);
            tempList.add(qty);
            if (!productMap.containsKey(product)) {
                productMap.put(product, tempList);
            } else {
                tempList.set(1, productMap.get(product).get(1) + qty);
                productMap.put(product, tempList);
            }
            command = scanner.nextLine().split("\\s+");
        }
        for (Map.Entry<String, ArrayList<Double>> entry : productMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1));
        }

    }
}
