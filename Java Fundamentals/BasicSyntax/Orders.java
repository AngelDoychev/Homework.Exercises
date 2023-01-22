package FirstStepsInCoding.Fundamentals.BasicSyntax;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orders = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        for (int i = 1; i <=orders; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());
            double sum = ((days * capsules) * price);
            totalSum +=sum;
            System.out.printf("The price for the coffee is: $%.2f%n", sum);
        }
        System.out.printf("Total: $%.2f", totalSum);
    }
}
