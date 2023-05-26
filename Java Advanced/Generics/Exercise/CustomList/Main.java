package JavaAdvance.Generics.Exercise.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        CustomList<String> customList = new CustomList<>();
        while (!command[0].equals("END")) {
            switch (command[0]) {
                case "Add":
                    customList.add(command[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(command[1]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(command[1]));
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(command[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    System.out.println(customList);
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
    }
}
