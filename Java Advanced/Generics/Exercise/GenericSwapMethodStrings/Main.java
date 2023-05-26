package JavaAdvance.Generics.Exercise.GenericSwapMethodStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box box = new Box();
        for (int i = 0; i < n; i++) {
            String currentElement = scanner.nextLine();
            box.add(currentElement);
        }
        int[] numbersForSwap = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        box.swap(numbersForSwap[0], numbersForSwap[1]);
        System.out.println(box);
    }
}
