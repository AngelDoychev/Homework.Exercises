package FirstStepsInCoding.Fundamentals.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i <= Math.min(numbers1.size(), numbers2.size()) - 1; i++) {
            newList.add(numbers1.get(i));
            newList.add(numbers2.get(i));
        }
        if (numbers1.size() > numbers2.size()) {
            newList.addAll(getRemainingElements(numbers1, numbers2));
        } else if (numbers2.size() > numbers1.size()) {
            newList.addAll(getRemainingElements(numbers2, numbers1));
        }
        for (int number : newList) {
            System.out.print(number + " ");
        }
    }

    public static List<Integer> getRemainingElements(List<Integer> longerList, List<Integer> shorterList) {
        List<Integer> nums = new ArrayList<>();
        for (int i = shorterList.size(); i < longerList.size(); i++) {
            nums.add(longerList.get(i));
        }
        return nums;
    }
}
