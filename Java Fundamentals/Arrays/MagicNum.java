package FirstStepsInCoding.Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numbersArr.length-1; i++) {
            int currentNum = numbersArr[i];
            for (int j = i+1; j <= numbersArr.length-1; j++) {
                int nextNum = numbersArr[j];
                if (currentNum + nextNum == magicNum) {
                    System.out.printf("%d %d %n", currentNum, nextNum);
                }
            }
        }
    }
}
