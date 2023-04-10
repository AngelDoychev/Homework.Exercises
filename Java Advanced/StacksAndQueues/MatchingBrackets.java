package JavaAdvance.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        ArrayDeque<Integer> index = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (symbol == '(') {
                index.push(i);
            } else if (symbol == ')') {
                int start = index.pop();
                int end = i;
                String subString = expression.substring(start, end + 1);
                System.out.println(subString);
            }
        }
    }
}
