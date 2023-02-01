package FirstStepsInCoding.Fundamentals.Arrays.MoreExercises;

import java.util.Scanner;

public class EncryptSortandPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            String[] numArr = scanner.nextLine().split(" ");
            for (int j = 0; j < numArr.length; j++) {
                int sum = 0;
                for (int k = 0; k < numArr[j].length(); k++) {
                    char ch = numArr[j].charAt(k);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        sum += ch * numArr[j].length();
                    } else {
                        sum += ch / numArr[j].length();
                    }
                }
                newArr[i] = sum;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            for (int j = i + 1; j < newArr.length; j++) {
                int temp = 0;
                if (newArr[i] > newArr[j]) {
                    temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.printf("%s%n", newArr[i]);
        }
    }
}
