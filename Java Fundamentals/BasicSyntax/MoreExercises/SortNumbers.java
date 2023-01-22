package FirstStepsInCoding.Fundamentals.BasicSyntax.MoreExercises;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int tmp = 0;
        if (a < b) { tmp = a; a = b; b = tmp; }
        if (a < c) { tmp = a; a = c; c = tmp; }
        if (b < c) { tmp = b; b = c; c = tmp; }

        System.out.printf("%d%n%d%n%d%n", a, b , c);
    }
}
