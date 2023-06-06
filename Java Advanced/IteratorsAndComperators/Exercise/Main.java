package JavaAdvance.IteratorsAndComperators.Exercise.StackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        Stack stack = new Stack();
        while (!command[0].equals("END")) {
            switch (command[0]) {
                case "Push":
                    String temp = String.join("", command).replaceAll("[^0-9,-]", "");
                    Integer[] numbers = new Integer[0];
                    if (temp.length() > 0) {
                        numbers = Arrays.stream(temp.split(",")).map(Integer::parseInt).toArray(Integer[]::new);
                    }
                    stack.push(numbers);
                    break;
                case "Pop":
                    assert stack != null;
                    if (stack.getLength() == 0) {
                        System.out.println("No elements");
                    } else {
                        stack.pop();
                    }
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
        assert stack != null;
        for (Integer number : stack) {
            System.out.println(number);
        }
    }
}
