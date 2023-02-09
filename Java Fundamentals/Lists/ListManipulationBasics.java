package FirstStepsInCoding.Fundamentals.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            addNum(command, nums);
            removeNum(command, nums);
            removeNumAtIndex(command, nums);
            insertNum(command, nums);
            command = scanner.nextLine().split(" ");
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void addNum(String[] command, List<Integer> nums) {
        if (command[0].equals("Add")) {
            int num = Integer.parseInt(command[1]);
            nums.add(nums.size(), num);
        }
    }

    public static void removeNum(String[] command, List<Integer> nums) {
        if (command[0].equals("Remove")) {
            int num = Integer.parseInt(command[1]);
            nums.remove(Integer.valueOf(num));
        }
    }

    public static void removeNumAtIndex(String[] command, List<Integer> nums) {
        if (command[0].equals("RemoveAt")) {
            int num = Integer.parseInt(command[1]);
            nums.remove(num);
        }
    }

    public static void insertNum(String[] command, List<Integer> nums) {
        if (command[0].equals("Insert")) {
            int num = Integer.parseInt(command[1]);
            int index = Integer.parseInt(command[2]);
            nums.add(index, num);
        }
    }
}
