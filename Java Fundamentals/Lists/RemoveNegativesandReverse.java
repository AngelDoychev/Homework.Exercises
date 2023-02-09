package FirstStepsInCoding.Fundamentals.Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesandReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 0) {
                nums.remove(nums.get(i));
                i--;
            }
        }
        Collections.reverse(nums);
        if (nums.size() > 0) {
            for (int num : nums) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("empty");
        }
    }
}
