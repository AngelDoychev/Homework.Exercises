package JavaAdvance.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, Integer> smallest = e -> {
            int smallestNum = Integer.MAX_VALUE;
            int count = 0;
            int index = -1;
            for (Integer current : numbers) {
                if (smallestNum >= current) {
                    smallestNum = current;
                    index = count;
                }
                count++;
            }
            return (index);
        };
        System.out.println(smallest.apply(numbers));
    }
}
