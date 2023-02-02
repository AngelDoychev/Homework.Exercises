package FirstStepsInCoding.Fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double num2 = Double.parseDouble(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.##");
        switch (operator) {
            case "+":
                System.out.println(df.format(addType(num1, num2)));
                break;
            case "-":
                System.out.println(df.format(subtractType(num1, num2)));
                break;
            case "*":
                System.out.println(df.format(multiplyType(num1, num2)));
                break;
            case "/":
                System.out.println(df.format(divideType(num1, num2)));
                break;
        }
    }

    public static double addType(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtractType(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplyType(double num1, double num2) {
        return num1 * num2;
    }

    public static double divideType(double num1, double num2) {
        return num1 / num2;
    }
}
