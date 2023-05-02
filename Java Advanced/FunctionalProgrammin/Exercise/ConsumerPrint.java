package JavaAdvance.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");
        Consumer<String> consumeName = System.out::println;
        Arrays.stream(names).forEach(consumeName);
    }
}
