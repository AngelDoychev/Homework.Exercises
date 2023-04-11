package JavaAdvance.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> textQueue = new ArrayDeque<>();
        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (textQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + textQueue.poll());
                }
            } else {
                textQueue.offer(input);
            }
            input = scanner.nextLine();
        }
        for (String file : textQueue) {
            System.out.println(file);
        }
    }
}
