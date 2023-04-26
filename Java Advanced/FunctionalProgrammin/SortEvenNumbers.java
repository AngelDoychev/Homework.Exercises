package JavaAdvance.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(e -> Integer.parseInt(e)).filter(e -> e % 2 == 0).map(e -> e.toString()).collect(Collectors.toList());
        System.out.println(String.join(", ", numbers));
        numbers = numbers.stream().map(Integer::parseInt).sorted().map(Object::toString).collect(Collectors.toList());
        System.out.println(String.join(", ", numbers));
    }
}
