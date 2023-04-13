package JavaAdvance.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int numbersToEnqueue = numbers[0];
        int numbersToDequeue = numbers[1];
        int isNumberInQueue = numbers[2];
        int[] currentNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numbersToEnqueue; i++) {
            queue.offer(currentNumbers[i]);
        }
        for (int i = 0; i < numbersToDequeue; i++) {
            queue.poll();
        }
        if (queue.contains(isNumberInQueue)) {
            System.out.println("true");
        } else {
            if (queue.isEmpty()) {
                System.out.println("0");
            } else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
