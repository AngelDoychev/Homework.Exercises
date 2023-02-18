package MidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> groceries = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("Go") && !command[1].equals("Shopping!")) {
            String item = command[1];
            switch (command[0]) {
                case "Urgent":
                    if (!groceries.contains(item)) {
                        groceries.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if (groceries.contains(item)) {
                        groceries.remove(item);
                    }
                    break;
                case "Correct":
                    if (groceries.contains(item)) {
                        groceries.set(groceries.indexOf(item), command[2]);
                    }
                    break;
                case "Rearrange":
                    if (groceries.contains(item)) {
                        String holder = item;
                        groceries.remove(item);
                        groceries.add(holder);
                    }
                    break;
            }

            command = scanner.nextLine().split("\\s+");
        }
        for (int i = 0; i < groceries.size() - 1; i++) {
            System.out.print(groceries.get(i) + ", ");
        }
        System.out.print(groceries.get(groceries.size() - 1));
    }
}
