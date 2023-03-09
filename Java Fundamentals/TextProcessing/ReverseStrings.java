package Fundametals.TextProcessing;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            StringBuilder sb = new StringBuilder();
            sb.append(command);
            System.out.print(sb.toString() + " = ");
            sb.reverse();
            System.out.println(sb.toString());
            command = scanner.nextLine();
        }
    }
}
