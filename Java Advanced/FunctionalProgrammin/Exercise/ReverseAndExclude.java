package JavaAdvance.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(numbers);
        int num = Integer.parseInt(scanner.nextLine());
        numbers.stream().filter(e -> e % num != 0).forEach(e -> System.out.print(e + " "));
    }
}
