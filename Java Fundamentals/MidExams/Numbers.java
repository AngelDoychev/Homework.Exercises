package MidExams;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        double average = sum * 1.0 / nums.size();
        Collections.sort(nums);
        Collections.reverse(nums);
        int count = 0;
        if (nums.size() < 5) {
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) > average) {
                    count++;
                    System.out.print(nums.get(i) + " ");
                }
            }
        } else {
            for (int i = 0; i < 5; i++) {
                if (nums.get(i) > average) {
                    count++;
                    System.out.print(nums.get(i) + " ");
                }
            }
        }
        if (count == 0) {
            System.out.println("No");
        }
    }
}
