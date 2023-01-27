package FirstStepsInCoding.Fundamentals.Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");
        for (String secondElement : secondArr) {
            for (String firstElement : firstArr) {
                if (firstElement.equals(secondElement)) {
                    System.out.printf("%s ", firstElement);
                    break;
                }
            }
        }
    }
}
