package Fundametals.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> itemsMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> junksMap = new LinkedHashMap<>();
        int currentQty = 0;
        String currentItem = "";
        boolean haveLegendary = false;
        while (!haveLegendary) {
            String[] items = scanner.nextLine().split("\\s+");
            for (int i = 0; i < items.length; i++) {
                if (i % 2 == 0) {
                    currentQty = Integer.parseInt(items[i]);
                } else {
                    currentItem = items[i].toLowerCase();
                    if (currentItem.equals("shards") || currentItem.equals("fragments") || currentItem.equals("motes")) {
                        if (!itemsMap.containsKey(currentItem)) {
                            itemsMap.put(currentItem, currentQty);
                        } else {
                            itemsMap.put(currentItem, itemsMap.get(currentItem) + currentQty);
                        }
                    } else {
                        if (!junksMap.containsKey(currentItem)) {
                            junksMap.put(currentItem, currentQty);
                        } else {
                            junksMap.put(currentItem, junksMap.get(currentItem) + currentQty);
                        }
                    }
                }
                if (itemsMap.containsKey("shards")) {
                    if (itemsMap.get("shards") >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        itemsMap.put("shards", itemsMap.get("shards") - 250);
                        haveLegendary = true;
                        break;
                    }
                } else {
                    itemsMap.put("shards", 0);
                }
                if (itemsMap.containsKey("fragments")) {
                    if (itemsMap.get("fragments") >= 250) {
                        System.out.println("Valanyr obtained!");
                        itemsMap.put("fragments", itemsMap.get("fragments") - 250);
                        haveLegendary = true;
                        break;
                    }
                } else {
                    itemsMap.put("fragments", 0);
                }
                if (itemsMap.containsKey("motes")) {
                    if (itemsMap.get("motes") >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        itemsMap.put("motes", itemsMap.get("motes") - 250);
                        haveLegendary = true;
                        break;
                    }
                } else {
                    itemsMap.put("motes", 0);
                }
            }
        }
        System.out.printf("shards: %d%nfragments: %d%nmotes: %d%n",
                itemsMap.get("shards"), itemsMap.get("fragments"), itemsMap.get("motes"));
        for (Map.Entry<String, Integer> entry : junksMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}