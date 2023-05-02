package JavaAdvance.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");
        Consumer<String> consumeName = e -> System.out.println("Sir " + e);
        Arrays.stream(names).forEach(consumeName);
    }
}
