package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            if (isPalindrome(command)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            command = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String command) {
        String newString = "";
        for (int i = command.length() - 1; i >= 0; i--) {
            newString += command.charAt(i);
        }
        return newString.equals(command);
    }
}
