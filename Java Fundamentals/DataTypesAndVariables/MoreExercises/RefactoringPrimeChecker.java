package FirstStepsInCoding.Fundamentals.DataTypesAmdVariables.MoreExercises;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = Integer.parseInt(scanner.nextLine());
        for (int number = 2; number <= range; number++) {
            boolean flag = true;
            for (int checkIfPrime = 2; checkIfPrime < number; checkIfPrime++) {
                if (number % checkIfPrime == 0) {
                    flag = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", number, flag);
        }
    }
}