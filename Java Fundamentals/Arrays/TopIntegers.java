package FirstStepsInCoding.Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numersArr.length; i++) {
            boolean flag = true;
            if (i == numersArr.length - 1) {
                System.out.printf("%d ", numersArr[i]);
            }
            for (int j = i + 1; j < numersArr.length; j++) {
                if (numersArr[i] > numersArr[j]) {

                } else {
                    flag = false;
                }
                if (flag) {
                    System.out.printf("%d ", numersArr[i]);
                    break;
                }
            }
        }
    }
}
