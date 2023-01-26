package FirstStepsInCoding.Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while (numbersArr.length > 1) {
            int[] condensedArr = new int[numbersArr.length - 1];
            for (int i = 0; i < numbersArr.length - 1; i++) {
                condensedArr[i] = numbersArr[i] + numbersArr[i + 1];
            }
            numbersArr = condensedArr;
        }
        System.out.println(numbersArr[0]);
    }
}
