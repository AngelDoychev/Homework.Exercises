package FirstStepsInCoding.Fundamentals.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0) {
                int first = numbers.get(0);
                numbers.remove(0);
                sum += first;
                int last = numbers.get(numbers.size() - 1);
                numbers.add(0, last);
                modify(numbers, first);
            } else if (index > numbers.size() - 1) {
                int last = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                int first = numbers.get(0);
                sum += last;
                numbers.add(first);
                modify(numbers, last);
            } else if (index >= 0 && index <= numbers.size() - 1) {
                int removed = numbers.get(index);
                sum += removed;
                numbers.remove(index);
                modify(numbers, removed);
            }
        }
        System.out.println(sum);
    }

    public static void modify(List<Integer> numbers, int removed) {
        for (int i = 0; i <= numbers.size() - 1; i++) {
            int num = numbers.get(i);
            if (num <= removed) {
                num += removed;
            } else {
                num -= removed;
            }
            numbers.set(i, num);
        }
    }
}
