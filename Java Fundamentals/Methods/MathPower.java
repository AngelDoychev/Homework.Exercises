package FirstStepsInCoding.Fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(toThePowerOf(num1, num2)));
    }

    public static double toThePowerOf(double num1, double num2) {
        double temp = num1;
        for (int i = 1; i < num2; i++) {
            num1 *= temp;
        }
        return num1;
    }
}
