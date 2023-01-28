package FirstStepsInCoding.Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersArr = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        String firstNum = "";
        for (int j = 1; j <= n; j++) {
            firstNum = numbersArr[0];
            for (int i = 0; i < numbersArr.length - 1; i++) {
                numbersArr[i] = numbersArr[i + 1];
            }
            numbersArr[numbersArr.length - 1] = firstNum;

        }
        for (int i = 0; i < numbersArr.length; i++) {
            System.out.printf("%s ", numbersArr[i]);
        }
    }
}
