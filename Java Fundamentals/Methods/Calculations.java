package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch (action) {
            case "add":
                addAction(a, b);
                break;
            case "multiply":
                multiplyAction(a, b);
                break;
            case "subtract":
                subtractAction(a, b);
                break;
            case "divide":
                divideAction(a, b);
                break;
        }
    }

    public static void addAction(int a, int b) {
        System.out.println(Math.abs(a + b));
    }

    public static void multiplyAction(int a, int b) {
        System.out.println(Math.abs(a * b));
    }

    public static void subtractAction(int a, int b) {
        System.out.println(Math.abs(a - b));
    }

    public static void divideAction(int a, int b) {
        System.out.println(Math.abs(a / b));
    }
}
