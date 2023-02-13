package Fundametals.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] input = scanner.nextLine().split("\\s+");
        int bomb = Integer.parseInt(input[0]);
        int power = Integer.parseInt(input[1]);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == bomb) {
                int rangeFrom = i - power;
                int rangeTo = i + power;
                if (rangeTo>=nums.size()) {
                    nums.subList(rangeFrom, nums.size()).clear();
                } else if (rangeFrom<0) {
                    nums.subList(0, rangeTo + 1).clear();
                } else if (rangeFrom<0&&rangeTo>=nums.size()) {
                    nums.subList(0, nums.size()).clear();
                } else {
                    nums.subList(rangeFrom, rangeTo + 1).clear();
                }
            }
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
