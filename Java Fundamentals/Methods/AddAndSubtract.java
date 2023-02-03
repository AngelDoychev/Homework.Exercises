package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int newNum = addNumbers(a, b);
        int result = subtractNumbers(newNum, c);
        System.out.println(result);
    }

    public static int addNumbers(int a, int b) {
        int newNum = 0;
        return newNum = a + b;
    }

    public static int subtractNumbers(int newNum, int c) {
        int result = 0;
        return result = newNum - c;
    }
}
