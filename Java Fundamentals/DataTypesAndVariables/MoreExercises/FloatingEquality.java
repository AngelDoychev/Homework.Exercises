package FirstStepsInCoding.Fundamentals.DataTypesAmdVariables.MoreExercises;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double epsilon = 0.000001;
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        if (Math.abs(a-b)>epsilon){
            System.out.println("False");
        }else {
            System.out.println("True");
        }
    }
}
