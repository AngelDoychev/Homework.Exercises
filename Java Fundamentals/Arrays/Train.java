package FirstStepsInCoding.Fundamentals.Arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumPassengers = 0;
        int[] trainArr = new int[n];
        for (int i = 0; i < n; i++) {
            trainArr[i] = Integer.parseInt(scanner.nextLine());
            sumPassengers += trainArr[i];
        }
        for (int i = 0; i < trainArr.length; i++) {
            System.out.printf("%d ", trainArr[i]);
        }

        System.out.printf("%n%d", sumPassengers);
    }
}
