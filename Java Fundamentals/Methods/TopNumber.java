package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {


            boolean isDivisible = divisibleByEight(i);
            boolean holdsOdd = holdsOddDigit(i);
            if (isDivisible && holdsOdd) {
                System.out.println(i);
            }
        }
    }

    public static boolean divisibleByEight(int num) {
        int newNum = 0;
        while (num > 0) {
            newNum += num % 10;
            num /= 10;
        }
        if (newNum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean holdsOddDigit(int num) {
        boolean check = false;
        while (num > 0) {
            int lastNum = num % 10;
            if (lastNum % 2 != 0) {
                check = true;
            }
            num /= 10;
        }
        if (check) {
            return true;
        } else {
            return false;
        }
    }
}
