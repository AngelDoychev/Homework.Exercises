package Fundametals.TextProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] textArr = scanner.nextLine().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < textArr.length; i++) {
            for (int j = 0; j < textArr[i].length(); j++) {
                sb.append(textArr[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
