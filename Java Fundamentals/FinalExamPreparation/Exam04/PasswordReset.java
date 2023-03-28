package Fundametals.FinalExamPreparation.Exam04;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] command = scanner.nextLine().split("\\s+");
        StringBuilder output = new StringBuilder(text);
        while (!command[0].equals("Done")) {
            switch (command[0]) {
                case "TakeOdd":
                    StringBuilder newPassword = new StringBuilder();
                    for (int i = 1; i < output.length(); i += 2) {
                        newPassword.append(output.charAt(i));
                    }
                    System.out.println(newPassword);
                    output = new StringBuilder(newPassword);
                    break;
                case "Cut":
                    int index = Integer.parseInt(command[1]);
                    int length = Integer.parseInt(command[2]);
                    String temp = output.substring(index, index + length);
                    output = new StringBuilder(output.toString().replaceFirst(temp, ""));
                    System.out.println(output);
                    break;
                case "Substitute":
                    String subString = command[1];
                    String substitute = command[2];
                    if (output.toString().contains(subString)) {
                        output = new StringBuilder(output.toString().replaceAll(subString, substitute));
                        System.out.println(output);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
        System.out.println("Your password is: " + output);
    }
}
