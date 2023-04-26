package JavaAdvance.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(e -> Character.isUpperCase(e.charAt(0))).collect(Collectors.toList());
        System.out.println(list.size());
        list.stream().forEach(e -> System.out.print(e + "\n"));
    }
}
