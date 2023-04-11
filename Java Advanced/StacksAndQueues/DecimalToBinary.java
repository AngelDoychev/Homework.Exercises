package JavaAdvance.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        if (input == 0) {
            System.out.println(0);
        } else {
            ArrayDeque<Integer> numbersStack = new ArrayDeque<>();
            while (input > 0) {
                numbersStack.push(input % 2);
                input /= 2;
            }
            StringBuilder output = new StringBuilder();
            for (Integer num : numbersStack) {
                output.append(num);
            }
            while (!numbersStack.isEmpty()) {
                numbersStack.pop();
            }
            System.out.println(output);
        }
    }
}
