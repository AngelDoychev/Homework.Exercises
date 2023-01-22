package FirstStepsInCoding.Fundamentals.BasicSyntax;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double totalMoney = 0;
        double money = 0;
        while(!command.equals("End")) {
            if (command.equals("Start") || command.equals("Nuts")||command.equals("Water")||command.equals("Crisps")||command.equals("Soda")||command.equals("Coke")) {

            } else {
                money = Double.parseDouble(command);
            if (money == 2 || money == 1 || money == 0.5 || money == 0.2 || money == 0.1) {
                totalMoney += money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
        }
if (command.equals("Start")) {
    while (!command.equals("End")) {
        command = scanner.nextLine();
        switch (command) {
            case "Nuts":
                if (totalMoney < 2) {
                    System.out.println("Sorry,  not enough money");
                    break;
                } else {
                    totalMoney -= 2;

                    System.out.printf("Purchased %s%n", command);
                }
                break;
            case "Water":
                if (totalMoney < 0.7) {
                    System.out.println("Sorry,  not enough money");
                    break;
                } else {
                    totalMoney -= 0.7;
                    System.out.printf("Purchased %s%n", command);
                }
                break;
            case "Crisps":
                if (totalMoney <1.5) {
                    System.out.println("Sorry,  not enough money");
                    break;
                } else {
                    totalMoney -= 1.5;
                    System.out.printf("Purchased %s%n", command);
                }
                break;
            case "Soda":
                if (totalMoney <0.8) {
                    System.out.println("Sorry,  not enough money");
                    break;
                } else {
                    totalMoney -= 0.8;
                    System.out.printf("Purchased %s%n", command);
                }
                break;
            case "Coke":
                if (totalMoney <1) {
                    System.out.println("Sorry,  not enough money");
                    break;
                } else {
                    totalMoney -= 1;

                    System.out.printf("Purchased %s%n", command);
                }
                break;
            case"End":
                break;
            default:
                System.out.println("Invalid product");
                break;
        }
    }
}
if (command.equals("End")){
    break;
}
            command = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n", totalMoney);
    }
}
