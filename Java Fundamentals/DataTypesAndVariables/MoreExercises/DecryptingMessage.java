package FirstStepsInCoding.Fundamentals.DataTypesAmdVariables.MoreExercises;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int letterCount = Integer.parseInt(scanner.nextLine());
        String message = "";
        for (int i = 1; i <= letterCount; i++) {
            char letterWithoutKey = scanner.nextLine().charAt(0);
            int letterWithKey = letterWithoutKey + key;
            message = message + (char) letterWithKey;
        }
        System.out.println(message);
    }
}
