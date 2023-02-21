package Fundametals.Lists.RegularMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheAngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ratings = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        boolean left = false;
        boolean right = false;
        int leftSum = 0;
        int rightSum = 0;
        switch (type) {
            case "cheap":
                for (int i = 0; i < entryPoint; i++) {
                    if (ratings.get(i) < ratings.get(entryPoint)) {
                        leftSum += ratings.get(i);
                    }
                }
                for (int i = entryPoint + 1; i < ratings.size(); i++) {
                    if (ratings.get(i) < ratings.get(entryPoint)) {
                        rightSum += ratings.get(i);
                    }
                }
                if (leftSum >= rightSum) {
                    left = true;
                } else {
                    right = true;
                }
                break;
            case "expensive":
                for (int i = 0; i < entryPoint; i++) {
                    if (ratings.get(i) >= ratings.get(entryPoint)) {
                        leftSum += ratings.get(i);
                    }
                }
                for (int i = entryPoint + 1; i < ratings.size(); i++) {
                    if (ratings.get(i) >= ratings.get(entryPoint)) {
                        rightSum += ratings.get(i);
                    }
                }
                if (leftSum >= rightSum) {
                    left = true;
                } else {
                    right = true;
                }
                break;
        }
        if (left) {
            System.out.printf("Left - %d%n", leftSum);
        } else if (right) {
            System.out.printf("Right - %d%n", rightSum);
        }
    }
}