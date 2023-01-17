package FirstStepsInCoding.Fundamentals.BasicSyntax.MoreExercises;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
double budget = Double.parseDouble(scanner.nextLine());
double totalSpent = 0;
String command = scanner.nextLine();
        while (!command.equals("Game Time")){
            switch (command) {
                case "OutFall 4":
                    if (budget < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        budget -= 39.99;
                        totalSpent+=39.99;
                        System.out.printf("Bought %s%n", command);
            }
                    break;
                case "CS: OG":
                    if (budget<15.99) {
                        System.out.println("Too Expensive");
                    }else {
                        budget-=15.99;
                        totalSpent+=15.99;
                        System.out.printf("Bought %s%n", command);
                    }
                    break;
                case "Zplinter Zell":
                    if (budget<19.99){
                        System.out.println("Too Expensive");
                    }else {
                        budget -= 19.99;
                        totalSpent+=19.99;
                        System.out.printf("Bought %s%n", command);
                    }
                    break;
                case "Honored 2":
                    if (budget<59.99) {
                        System.out.println("Too Expensive");
                    }else {
                        budget -= 59.99;
                        totalSpent+=59.99;
                        System.out.printf("Bought %s%n", command);
                    }
                    break;
                case "RoverWatch":
                    if (budget<29.99) {
                        System.out.println("Too Expensive");
                    }else{
                        budget-=29.99;
                        totalSpent+=29.99;
                        System.out.printf("Bought %s%n", command);
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (budget<39.99) {
                        System.out.println("Too Expensive");
                    }else {
                        budget-=39.99;
                        totalSpent+=39.99;
                        System.out.printf("Bought %s%n", command);
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (budget<=0){
                System.out.println("Out of money!");
                break;
            }
            command = scanner.nextLine();
        }
        if (budget>0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, budget);
        }
    }
}
