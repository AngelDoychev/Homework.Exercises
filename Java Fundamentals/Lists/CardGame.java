package Fundametals.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> p1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> p2 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        while (p1.size() != 0 || p2.size() != 0) {
            if (p1.size() == 0 || p2.size() == 0) {
                break;
            }
            if (p1.get(0) > p2.get(0)) {
                int winingCard = p1.get(0);
                int losingCard = p2.get(0);
                p1.remove(0);
                p2.remove(0);
                p1.add(winingCard);
                p1.add(losingCard);
            } else if (p2.get(0) > p1.get(0)) {
                int winingCard = p2.get(0);
                int losingCard = p1.get(0);
                p1.remove(0);
                p2.remove(0);
                p2.add(winingCard);
                p2.add(losingCard);
            } else {
                p1.remove(0);
                p2.remove(0);
            }
        }
        if (p1.size() > p2.size()) {
            int sum = 0;
            for (int numbers : p1) {
                sum += numbers;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            int sum = 0;
            for (int numbers : p2) {
                sum += numbers;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
