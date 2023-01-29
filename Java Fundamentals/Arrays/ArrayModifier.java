package FirstStepsInCoding.Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "swap":
                    int firstNumPosition = Integer.parseInt(command[1]);
                    int secondNumPosition = Integer.parseInt(command[2]);
                    int currentNum = numberArr[firstNumPosition];
                    numberArr[firstNumPosition] = numberArr[secondNumPosition];
                    numberArr[secondNumPosition] = currentNum;
                    break;
                case "multiply":
                    int firstNumPositionX = Integer.parseInt(command[1]);
                    int secondNumPositionX = Integer.parseInt(command[2]);
                    int result = numberArr[firstNumPositionX] * numberArr[secondNumPositionX];
                    numberArr[firstNumPositionX] = result;
                    break;
                case "decrease":
                    for (int i = 0; i < numberArr.length; i++) {
                        numberArr[i]--;
                    }
                    break;
            }

            command = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < numberArr.length-1; i++) {
            System.out.printf("%d, ", numberArr[i]);
        }
        System.out.printf("%d ", numberArr[numberArr.length-1]);
    }
}
