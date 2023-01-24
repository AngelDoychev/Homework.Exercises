package FirstStepsInCoding.Fundamentals.DataTypesAmdVariables;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String devider = scanner.nextLine();
        String inBetween = String.format("%s%s%s", firstName, devider, secondName);
        System.out.println(inBetween);
    }
}
