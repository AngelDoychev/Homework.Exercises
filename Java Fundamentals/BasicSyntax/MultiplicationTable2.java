package FirstStepsInCoding.Fundamentals.BasicSyntax;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int result = 0;
        int result2 = num1 * num2;
        for (int i = 1; i <=100; i++) {
            if (i>=num2&&i<11) {
                 result = num1 * i;
                System.out.printf("%d X %d = %d%n", num1, i, result);
            }
            if (num2>10){
                System.out.printf("%d X %d = %d%n", num1, num2, result2);
                break;
            }
        }
    }
}
