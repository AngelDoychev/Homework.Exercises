package FirstStepsInCoding.Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean flag = false;
        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i];
           int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbersArr[j];
            }
            for (int j = numbersArr.length - 1; j > i; j--) {
                rightSum += numbersArr[j];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("no");
        }
    }
}
