package FirstStepsInCoding.Fundamentals.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "Add":
                    int numAdd = Integer.parseInt(command[1]);
                    numbers.add(numAdd);
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    int numInsert = Integer.parseInt(command[1]);
                    if (index <= numbers.size() - 1) {
                        numbers.add(index, numInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int numRemove = Integer.parseInt(command[1]);
                    if (numRemove <= numbers.size() - 1) {
                        numbers.remove(numRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (command[1].equals("left")) {
                        int shiftXTimes = Integer.parseInt(command[2]);
                        for (int i = 0; i < shiftXTimes; i++) {
                            int num = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(num);
                        }
                    } else if (command[1].equals("right")) {
                        int num = numbers.get(numbers.size() - 1);
                        numbers.remove(numbers.size() - 1);
                        numbers.add(0, num);
                    }
                    break;

            }
            command = scanner.nextLine().split(" ");
        }
        for (int number : numbers) {
            System.out.print(number + "\\s+");
        }
    }
}
