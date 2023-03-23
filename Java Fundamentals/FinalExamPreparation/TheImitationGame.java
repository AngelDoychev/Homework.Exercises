package Fundametals.FinalExamPreparation;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] command = scanner.nextLine().split("\\|");
        StringBuilder sb = new StringBuilder();
        sb.append(word);
        while (!command[0].equals("Decode")) {
            switch (command[0]) {
                case "Move":
                    int lettersCount = Integer.parseInt(command[1]);
                    String temp = sb.substring(0, lettersCount);
                    sb.replace(0, lettersCount, "");
                    sb.append(temp);
                    break;
                case "Insert":
                    sb.insert(Integer.parseInt(command[1]), command[2]);
                    break;
                case "ChangeAll":
                    word = sb.toString().replace(command[1], command[2]);
                    sb.delete(0, sb.length());
                    sb.append(word);
                    break;
                default:
                    break;
            }
            command = scanner.nextLine().split("\\|");
        }
        System.out.println("The decrypted message is: " + sb.toString());
    }
}
