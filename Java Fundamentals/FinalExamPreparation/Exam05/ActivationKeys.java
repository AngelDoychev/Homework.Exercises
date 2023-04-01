package Fundametals.FinalExamPreparation.Exam05;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey = scanner.nextLine();
        String[] command = scanner.nextLine().split(">>>");
        StringBuilder updatedKey = new StringBuilder(activationKey);
        while (!command[0].equals("Generate")) {
            switch (command[0]) {
                case "Contains":
                    String subString = command[1];
                    if (updatedKey.toString().contains(subString)) {
                        System.out.printf("%s contains %s%n", updatedKey, subString);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String caseSensitivity = command[1];
                    int index = Integer.parseInt(command[2]);
                    int end = Integer.parseInt(command[3]);
                    switch (caseSensitivity) {
                        case "Lower":
                            String lowerCase = updatedKey.substring(index, end).toLowerCase();
                            updatedKey = new StringBuilder(updatedKey.replace(index, end, lowerCase));
                            break;
                        case "Upper":
                            String uppercase = updatedKey.substring(index, end).toUpperCase();
                            updatedKey = new StringBuilder(updatedKey.replace(index, end, uppercase));
                            break;
                    }
                    System.out.println(updatedKey);
                    break;
                case "Slice":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    updatedKey = new StringBuilder(updatedKey.replace(startIndex, endIndex, ""));
                    System.out.println(updatedKey);
                    break;
            }
            command = scanner.nextLine().split(">>>");
        }
        System.out.printf("Your activation key is: %s%n", updatedKey);
    }
}
