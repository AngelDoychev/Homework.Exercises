package MidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        int count = 0;
        while (!command.equals("End")) {
            int target = Integer.parseInt(command);
            if (target >= 0 && target < nums.size()) {
                for (int i = target + 1; i < nums.size(); i++) {
                    if (nums.get(i) == -1) {
                        continue;
                    }
                    if (nums.get(target) >= nums.get(i)) {
                        nums.set(i, nums.get(i) + nums.get(target));
                    } else {
                        nums.set(i, nums.get(i) - nums.get(target));
                    }
                }
                for (int i = target - 1; i >= 0; i--) {
                    if (nums.get(i) == -1) {
                        continue;
                    }
                    if (nums.get(target) >= nums.get(i)) {
                        nums.set(i, nums.get(i) + nums.get(target));
                    } else {
                        nums.set(i, nums.get(i) - nums.get(target));
                    }
                }
                count++;
                nums.set(target, -1);
            }
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", count);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
