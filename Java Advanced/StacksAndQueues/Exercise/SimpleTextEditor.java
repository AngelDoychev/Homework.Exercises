package JavaAdvance.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<StringBuilder> stack = new ArrayDeque<>();
        stack.push(text);
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (!stack.isEmpty()) {
                text = new StringBuilder(stack.peek());
            }
            switch (command[0]) {
                case "1":
                    String textToAppend = command[1];
                    text.append(textToAppend);
                    stack.push(text);
                    break;
                case "2":
                    int count = text.length() - Integer.parseInt(command[1]);
                    if (count < 0) {
                        count = 0;
                    }
                    text.delete(count, text.length());
                    stack.push(text);
                    break;
                case "3":
                    int index = Integer.parseInt(command[1]);
                    if (index - 1 < 0 || index - 1 > text.length()) {

                    } else {
                        System.out.println(text.toString().charAt(index - 1));
                    }
                    break;
                case "4":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;

            }
        }
    }
}
