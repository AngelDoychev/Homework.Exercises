package FirstStepsInCoding.Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbersArr2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        int count = -1;
        boolean flag = true;
        for (int i = 0; i < numbersArr1.length; i++) {
            count = i;
            if (numbersArr1[i] == numbersArr2[i]) {
                sum += numbersArr1[i];
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", count);
        }
    }
}
