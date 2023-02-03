package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        minNumber(a, b, c);
    }

    public static void minNumber(int a, int b, int c) {
        int firstCheck = Math.min(a, b);
        System.out.println(Math.min(firstCheck, c));
    }
}
