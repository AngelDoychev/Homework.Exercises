package FirstStepsInCoding.Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxCount = Integer.MIN_VALUE;
        int maxNum = 0;
        int count = 1;
        for (int i = 0; i < numbersArr.length - 1; i++) {
            int currentNum = numbersArr[i];
            int nextNum = numbersArr[i + 1];
            if (currentNum == nextNum) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    maxNum = numbersArr[i];
                }
            } else {
                count = 1;
            }
        }
        int[] newArr = new int[maxCount];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = maxNum;
        }

        for (int j = 0; j < newArr.length; j++) {
            System.out.printf("%d ", newArr[j]);
        }
    }
}
