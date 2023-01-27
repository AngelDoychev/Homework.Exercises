package FirstStepsInCoding.Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArr = new String[n];
        String[] secondArr = new String[n];
        String num1 = "";
        String num2 = "";
        int count = 1;
        for (int i = 0; i < n; i++) {
            count++;
            String[] numbers = scanner.nextLine().split(" ");
            if (count % 2 == 0) {
                firstArr[i] = numbers[0];
                secondArr[i] = numbers[1];
            } else {
                firstArr[i] = numbers[1];
                secondArr[i] = numbers[0];
            }
        }
        for (int i = 0; i < firstArr.length; i++) {
            System.out.printf("%s ", firstArr[i]);
        }
        System.out.println();
        for (int i = 0; i < secondArr.length; i++) {
            System.out.printf("%s ", secondArr[i]);
        }
    }
}
