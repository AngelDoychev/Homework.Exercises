package MidExams;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfCustomer = scanner.nextLine();
        double sum = 0;
        double taxes = 0;
        while (!typeOfCustomer.equals("special")) {
            if (typeOfCustomer.equals("regular")) {
                break;
            }
            double price = Double.parseDouble(typeOfCustomer);
            if (price < 0) {
                System.out.println("Invalid price!");
            } else {
                sum += price;
            }
            typeOfCustomer = scanner.nextLine();
        }
        taxes = sum * 0.2;
        switch (typeOfCustomer) {
            case "special":
                double sumWithTaxes = (sum + taxes) * 0.9;
                if (sumWithTaxes == 0) {
                    System.out.println("Invalid order!");
                } else {
                    System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$", sum, taxes, sumWithTaxes);
                }
                break;
            case "regular":
                if (sum + taxes == 0) {
                    System.out.println("Invalid order!");
                } else {
                    System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$", sum, taxes, (sum + taxes));
                }
                break;
        }
    }
}
