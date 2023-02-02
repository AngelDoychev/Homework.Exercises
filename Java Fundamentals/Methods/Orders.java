package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int qty = Integer.parseInt(scanner.nextLine());
        switch (product) {
            case "coffee":
                System.out.printf("%.2f",coffeeSum(qty));
                break;
            case "water":
                System.out.printf("%.2f",waterSum(qty));
                break;
            case "coke":
                System.out.printf("%.2f",cokeSum(qty));
                break;
            case "snacks":
                System.out.printf("%.2f",snacksSum(qty));
                break;
        }
    }

    public static double coffeeSum(int qty) {
        return qty * 1.5;
    }

    public static double waterSum(int qty) {
        return qty;
    }

    public static double cokeSum(int qty) {
        return qty * 1.4;
    }

    public static double snacksSum(int qty) {
        return qty * 2;
    }
}
