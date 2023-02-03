package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        isValid(password);
    }

    public static void isValid(String password) {
        boolean first = characterCountChecker(password);
        boolean second = onlyNumbersAndLetters(password);
        boolean third = containsDigits(password);
        if (first && second && third) {
            System.out.println("Password is valid");
        }
    }

    public static boolean characterCountChecker(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    public static boolean onlyNumbersAndLetters(String password) {
        boolean insideCheck = false;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
            } else if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
            } else if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
            } else {
                insideCheck = true;
            }
        }
        if (insideCheck) {
            System.out.println("Password must consist only of letters and digits");
            return false;
        } else {
            return true;
        }
    }

    public static boolean containsDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }
}
