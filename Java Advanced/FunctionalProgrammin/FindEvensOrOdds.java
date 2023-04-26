package JavaAdvance.FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] command = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int start = command[0];
        int end = command[1];
        List<Integer> numbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            numbers.add(i);
        }
        String type = scanner.nextLine();
        if (type.equals("odd")) {
            numbers.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.print(e + " "));
        } else if (type.equals("even")) {
            numbers.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.print(e + " "));
        }
    }
}
