package JavaAdvance.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        System.out.println("Count = " + list.size());
        System.out.println("Sum = " + list.stream().mapToInt(Integer::parseInt).sum());
    }
}
