package FirstStepsInCoding.Fundamentals.BasicSyntax;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int total = 0;
        for (int i = num1; i <=num2; i++) {
            System.out.printf("%d ", i);
            total+=i;
        }
        System.out.printf("%nSum: %d", total);
    }
}
