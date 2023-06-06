package JavaAdvance.IteratorsAndComperators.Exercise.Froggy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).toArray(Integer[]::new);
        Lake lake = new Lake(numbers);
        List<String> result = new ArrayList<>();
        for (Integer integer : lake) {
            result.add(String.valueOf(integer));
        }
        System.out.println(String.join(", ", result));
        String end = scanner.nextLine();
    }
}
