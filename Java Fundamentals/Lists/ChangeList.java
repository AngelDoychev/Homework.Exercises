package Fundametals.Lists;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "Delete":
                    nums.removeAll(List.of(Integer.parseInt(command[1])));
                    break;
                case "Insert":
                    nums.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
