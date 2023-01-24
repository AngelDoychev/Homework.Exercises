package FirstStepsInCoding.Fundamentals.DataTypesAmdVariables.MoreExercises;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            Scanner type = new Scanner(command);
            if (type.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n", command);
            } else if (type.hasNextInt()) {
                System.out.printf("%s is integer type%n", command);
            } else if (type.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", command);
            } else if (command.length() == 1) {
                System.out.printf("%s is character type%n", command);
            } else if (type.hasNextLine()) {
                System.out.printf("%s is string type%n", command);
            }
            command = scanner.nextLine();
        }
    }
}
