package Fundametals.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int max = Integer.parseInt(scanner.nextLine());
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("end")) {
            if (command[0].equals("Add")) {
                int passengers = Integer.parseInt(command[1]);
                nums.add(passengers);
            } else {
                int passengers = Integer.parseInt(command[0]);
                for (int i = 0; i < nums.size(); i++) {
                    if (nums.get(i) + passengers <= max) {
                        int newNum = nums.get(i) + passengers;
                        nums.set(i, newNum);
                        break;
                    }
                }
            }

            command = scanner.nextLine().split("\\s+");
        }
        for (int numbers : nums) {
            System.out.print(numbers + " ");
        }
    }
}
