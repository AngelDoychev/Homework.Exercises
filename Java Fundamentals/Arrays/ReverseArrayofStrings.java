package FirstStepsInCoding.Fundamentals.Arrays;

import java.util.Scanner;

public class ReverseArrayofStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lettersArr = scanner.nextLine().split(" ");
        for (int i = 0; i < lettersArr.length / 2; i++) {
            String original = lettersArr[i];
            lettersArr[i] = lettersArr[lettersArr.length - 1 - i];
            lettersArr[lettersArr.length - 1 - i] = original;
        }
        for (int i = 0; i < lettersArr.length; i++) {
            System.out.printf("%s ", lettersArr[i]);
        }
    }
}
