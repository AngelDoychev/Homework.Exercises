package MidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "swap":
                    int index1Swap = Integer.parseInt(command[1]);
                    int index2Swap = Integer.parseInt(command[2]);
                    int oldNum = nums.get(index1Swap);
                    nums.set(index1Swap, nums.get(index2Swap));
                    nums.set(index2Swap, oldNum);
                    break;
                case "multiply":
                    int index1X = Integer.parseInt(command[1]);
                    int index2X = Integer.parseInt(command[2]);
                    nums.set(index1X, (nums.get(index1X) * nums.get(index2X)));
                    break;
                case "decrease":
                    for (int i = 0; i < nums.size(); i++) {
                        nums.set(i, nums.get(i) - 1);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < nums.size() - 1; i++) {
            System.out.print(nums.get(i) + ", ");
        }
        System.out.print(nums.get(nums.size()-1));
    }
}
