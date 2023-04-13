package JavaAdvance.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();
        for (int num : numbers) {
            numbersStack.push(num);
        }
        for (Integer num : numbersStack) {
            System.out.print(numbersStack.pop() + " ");
        }
    }
}
