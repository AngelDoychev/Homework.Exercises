package JavaAdvance.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToDouble(Double::parseDouble).map(e -> e * 1.2).toArray();
        System.out.println("Prices with VAT:");
        Arrays.stream(numbers).forEach(e -> System.out.printf("%.2f%n", e));
    }
}
