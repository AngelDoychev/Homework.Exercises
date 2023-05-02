package JavaAdvance.FunctionalProgramming.Exercise;

import java.util.*;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        Comparator<Integer> sortNumbers = (first, second) -> {
            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            } else if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            }
            return first.compareTo(second);
        };
        Arrays.sort(numbers, sortNumbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}
