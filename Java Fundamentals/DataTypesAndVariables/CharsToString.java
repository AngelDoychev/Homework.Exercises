package FirstStepsInCoding.Fundamentals.DataTypesAmdVariables;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newWord = "";
        for (int i = 1; i <=3; i++) {
            char ch = scanner.nextLine().charAt(0);
            newWord = newWord + ch;
        }
        System.out.println(newWord);
    }
}
