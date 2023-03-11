package Fundametals.TextProcessing.Exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(", ");
        for (int i = 0; i < command.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < command[i].length(); j++) {
                char ch = command[i].charAt(j);
                if (command[i].length() >= 3 && command[i].length() <= 16) {
                    if (Character.isLetter(ch)) {
                        sb.append(ch);
                    } else if (Character.isDigit(ch)) {
                        sb.append(ch);
                    } else if (ch == '-' || ch == '_') {
                        sb.append(ch);
                    }
                } else {
                    break;
                }
            }
            if (command[i].equals(sb.toString())) {
                System.out.println(command[i]);
            }
        }
    }
}
