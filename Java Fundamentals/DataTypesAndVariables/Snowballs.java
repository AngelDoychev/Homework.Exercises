package FirstStepsInCoding.Fundamentals.DataTypesAmdVariables;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double bestSnowballSnow = Double.MIN_VALUE;
        double bestSnowballTime = Double.MIN_VALUE;
        double bestSnowballQuality = Double.MIN_VALUE;
        double bestSnowball = Double.MIN_VALUE;
        double snowball = 0;
        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            snowball = Math.pow((snowballSnow * 1.0 / snowballTime), snowballQuality);
            if (bestSnowball < snowball) {
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
                bestSnowball = snowball;
            }
        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)", bestSnowballSnow, bestSnowballTime, bestSnowball, bestSnowballQuality);
    }
}
