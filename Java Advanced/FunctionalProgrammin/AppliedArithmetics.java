package JavaAdvance.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    UnaryOperator<List<Integer>> addNum = current -> current.stream().map(e -> e + 1).collect(Collectors.toList());
                    numbers = addNum.apply(numbers);
                    break;
                case "multiply":
                    UnaryOperator<List<Integer>> multiplyNum = current -> current.stream().map(e -> e * 2).collect(Collectors.toList());
                    numbers = multiplyNum.apply(numbers);
                    break;
                case "subtract":
                    UnaryOperator<List<Integer>> subtractNum = current -> current.stream().map(e -> e - 1).collect(Collectors.toList());
                    numbers = subtractNum.apply(numbers);
                    break;
                case "print":
                    System.out.println();
                    numbers.forEach(number -> System.out.print(number + " "));
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
