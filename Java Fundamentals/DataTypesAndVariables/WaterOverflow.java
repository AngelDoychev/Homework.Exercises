package FirstStepsInCoding.Fundamentals.DataTypesAmdVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int sumOfLiters = 0;
        for (int i = 1; i <= n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (liters > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                capacity -= liters;
                sumOfLiters += liters;
            }
        }
        System.out.println(sumOfLiters);
    }
}
