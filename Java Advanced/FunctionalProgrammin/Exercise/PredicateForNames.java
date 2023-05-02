package JavaAdvance.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");
        Arrays.stream(names).filter(e -> e.length() <= n).forEach(System.out::println);
    }
}
