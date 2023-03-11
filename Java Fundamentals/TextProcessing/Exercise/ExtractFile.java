package Fundametals.TextProcessing.Exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\.");
        StringBuilder sb = new StringBuilder();
        sb.append(command[0].substring(command[0].lastIndexOf('\\') + 1, command[0].length()));
        System.out.printf("File name: %s%nFile extension: %s%n", sb, command[1]);
    }
}
