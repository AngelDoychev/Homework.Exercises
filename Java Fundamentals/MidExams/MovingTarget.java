package MidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("End")) {
            int num1 = Integer.parseInt(command[1]);
            int num2 = Integer.parseInt(command[2]);
            switch (command[0]) {
                case "Shoot":
                    if (num1 >= 0 && num1 < nums.size()) {
                        nums.set(num1, nums.get(num1) - num2);
                        if (nums.get(num1) <= 0) {
                            nums.remove(num1);
                        }
                    }
                    break;
                case "Add":
                    if (num1 >= 0 && num1 < nums.size()) {
                        nums.add(num1, num2);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    if (num1 - num2 < 0 || num1 + num2 >= nums.size()) {
                        System.out.println("Strike missed!");
                    } else {
                        for (int i = num1 - num2; i <= num1 + num2; i++) {
                            if (i >= 0 && i <= nums.size()) {
                                nums.remove(num1 - num2);
                            }
                        }
                    }
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
        if (!nums.isEmpty()) {
            for (int i = 0; i < nums.size() - 1; i++) {
                System.out.print(nums.get(i) + "|");
            }
            System.out.print(nums.get(nums.size() - 1));
        }
    }
}