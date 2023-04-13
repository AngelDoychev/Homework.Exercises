package JavaAdvance.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean isValid = true;
        for (int i = 0; i < input.length; i++) {
            String currentBracket = input[i];
            if (currentBracket.equals("(") || currentBracket.equals("[") || currentBracket.equals("{")) {
                stack.push(input[i].charAt(0));
            } else {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                char lastOpeningBracket = stack.pop();

                if (currentBracket.equals("}") && lastOpeningBracket != '{') {
                    isValid = false;
                    break;
                } else if (currentBracket.equals(")") && lastOpeningBracket != '(') {
                    isValid = false;
                    break;
                } else if (currentBracket.equals("]") && lastOpeningBracket != '[') {
                    isValid = false;
                    break;
                }
            }
        }
        if (isValid && stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
