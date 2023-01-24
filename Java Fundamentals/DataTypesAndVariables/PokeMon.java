package FirstStepsInCoding.Fundamentals.DataTypesAmdVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distanceToTravel = Integer.parseInt(scanner.nextLine());
        int fatigue = Integer.parseInt(scanner.nextLine());
        int pokes = 0;
        int originalPower = power/2;
        while (power >= distanceToTravel) {
            power -= distanceToTravel;
            pokes++;
            if (power == originalPower&&power!=0){
                if (fatigue!=0) {
                    power /= fatigue;
                }
            }
        }
        System.out.printf("%d%n%d", power, pokes);
    }
}
