package JavaAdvance.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();
        ArrayDeque<Integer> removedStack = new ArrayDeque<>();
        for (int i = input.length - 1; i >= 0; i--) {
            if (!input[i].equals("+") && !input[i].equals("-")) {
                numbersStack.push(Integer.parseInt(input[i]));
            }
            if (i > 0) {
                if (input[i - 1].equals("-")) {
                    removedStack.push(numbersStack.pop());
                }
            }
        }
        int output = numbersStack.stream().mapToInt(Integer::intValue).sum() - removedStack.stream().mapToInt(Integer::intValue).sum();
        System.out.println(output);
    }
}
