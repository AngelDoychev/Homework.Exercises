package JavaAdvance.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, Integer> minFunc = e -> {
            int num = Integer.MAX_VALUE;
            for (Integer currentNum : numbers) {
                if (num > currentNum) {
                    num = currentNum;
                }
            }
            return num;
        };
        System.out.println(minFunc.apply(numbers));
    }
}
