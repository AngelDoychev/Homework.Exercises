package JavaAdvance.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int numbersInStack = numbers[0];
        int numbersToPop = numbers[1];
        int isNumberInStack = numbers[2];
        int[] numbersToAdd = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numbersInStack; i++) {
            stack.push(numbersToAdd[i]);
        }
        for (int i = 0; i < numbersToPop; i++) {
            stack.pop();
        }
        if (stack.contains(isNumberInStack)) {
            System.out.println("true");
        } else {
            if (stack.isEmpty()) {
                System.out.println("0");
            } else {
                System.out.println(Collections.min(stack));
            }
        }
    }
}
