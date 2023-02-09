package FirstStepsInCoding.Fundamentals.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            contains(nums, command);
            ifEven(nums, command);
            ifOdd(nums, command);
            getSum(nums, command);
            filteredNum(nums, command);
            command = scanner.nextLine().split(" ");
        }
    }

    public static void contains(List<Integer> nums, String[] command) {
        if (command[0].equals("Contains")) {
            int num = Integer.parseInt(command[1]);
            if (nums.contains(num)) {
                System.out.println("Yes");
            } else {
                System.out.println("No such number");
            }
        }
    }

    public static void ifEven(List<Integer> nums, String[] command) {
        if (command[0].equals("Print") && command[1].equals("even")) {
            for (int num : nums) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }

    public static void ifOdd(List<Integer> nums, String[] command) {
        if (command[0].equals("Print") && command[1].equals("even")) {
            for (int num : nums) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }

    public static void getSum(List<Integer> nums, String[] command) {
        if (command[0].equals("Get") && command[1].equals("sum")) {
            int sum = 0;
            for (int i = 0; i < nums.size(); i++) {
                sum += nums.get(i);
            }
            System.out.println(sum);
        }
    }

    public static void filteredNum(List<Integer> nums, String[] command) {
        if (command[0].equals("Filter")) {
            int example = Integer.parseInt(command[2]);
            switch (command[1]) {
                case "<":
                    for (int number : nums) {
                        if (number < example) {
                            System.out.print(number + " ");
                        }
                    }
                    break;
                case "<=":
                    for (int number : nums) {
                        if (number <= example) {
                            System.out.print(number + " ");
                        }
                    }
                    break;
                case ">":
                    for (int number : nums) {
                        if (number > example) {
                            System.out.print(number + " ");
                        }
                    }
                    break;
                case ">=":
                    for (int number : nums) {
                        if (number >= example) {
                            System.out.print(number + " ");
                        }
                    }
                    break;
            }
            System.out.println();
        }
    }
}
