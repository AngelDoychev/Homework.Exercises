package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = Long.parseLong(scanner.nextLine());
        long b = Long.parseLong(scanner.nextLine());
        double result1 = factorialOne(a);
        double result2 = factorialTwo(b);
        System.out.printf("%.2f", result1 / result2);
    }

    public static long factorialOne(long a) {
        long result1 = 1;
        for (int i = 1; i <= a; i++) {
            result1 *= i;
        }
        return result1;
    }

    public static long factorialTwo(long b) {
        long result2 = 1;
        for (int i = 1; i <= b; i++) {
            result2 *= i;
        }
        return result2;
    }
}
