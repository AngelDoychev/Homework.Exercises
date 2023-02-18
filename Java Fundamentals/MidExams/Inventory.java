package MidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" - ");
        while (!command[0].equals("Craft!")) {
            String item = command[1];
            switch (command[0]) {
                case "Collect":
                    if (!items.contains(item)) {
                        items.add(item);
                    }
                    break;
                case "Drop":
                    if (items.contains(item)) {
                        items.remove(item);
                    }
                    break;
                case "Combine Items":
                    String item1 = command[1].split(":")[0];
                    String item2 = command[1].split(":")[1];
                    if (items.contains(item1)) {
                        items.add(items.indexOf(item1) + 1, item2);
                    }
                    break;
                case "Renew":
                    if (items.contains(item)) {
                        String temp = item;
                        items.remove(item);
                        items.add(temp);
                    }
                    break;
            }
            command = scanner.nextLine().split(" - ");
        }
        for (int i = 0; i < items.size() - 1; i++) {
            System.out.print(items.get(i) + ", ");
        }
        System.out.print(items.get(items.size() - 1));
    }
}
