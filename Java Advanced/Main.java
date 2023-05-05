package JavaAdvance.DefiningClasses.BankAccountProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        Map<Integer, BankAccount> map = new HashMap<>();
        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "Create":
                    BankAccount currentAccount = new BankAccount();
                    map.put(currentAccount.getId(), currentAccount);
                    System.out.printf("Account ID%d created%n", currentAccount.getId());
                    break;
                case "Deposit":
                    int currentId = Integer.parseInt(command[1]);
                    double amountDeposited = Double.parseDouble(command[2]);
                    if (map.containsKey(currentId)) {
                        map.get(currentId).deposit(amountDeposited);
                        System.out.printf("Deposited %.0f to ID%d%n", amountDeposited, currentId);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double newInterest = Double.parseDouble(command[1]);
                    BankAccount.setInterestRate(newInterest);
                    break;
                case "GetInterest":
                    int currentID = Integer.parseInt(command[1]);
                    int years = Integer.parseInt(command[2]);
                    if (map.containsKey(currentID)) {
                        System.out.printf("%.2f%n", map.get(currentID).getInterest(years));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
    }
}
