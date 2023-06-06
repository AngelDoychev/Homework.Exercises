package JavaAdvance.PastExams.PastExam01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RubberDuckDebuggers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> timeList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> tasksList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int timeIndex = 0;
        int darthVaderDucky = 0;
        int thorDucky = 0;
        int bigBlueRubberDucky = 0;
        int smallYellowRubberDucky = 0;
        int tasksIndex = tasksList.size() - 1;
        while (timeList.size() != 0 && tasksList.size() != 0) {
            int result = timeList.get(timeIndex) * tasksList.get(tasksIndex);
            if (result >= 0 && result <= 60) {
                timeList.remove(timeIndex);
                tasksList.remove(tasksIndex--);
                darthVaderDucky++;
            } else if (result >= 61 && result <= 120) {
                timeList.remove(timeIndex);
                tasksList.remove(tasksIndex--);
                thorDucky++;
            } else if (result >= 121 && result <= 180) {
                timeList.remove(timeIndex);
                tasksList.remove(tasksIndex--);
                bigBlueRubberDucky++;
            } else if (result >= 181 && result <= 240) {
                timeList.remove(timeIndex);
                tasksList.remove(tasksIndex--);
                smallYellowRubberDucky++;
            } else if (result > 240) {
                tasksList.set(tasksIndex, tasksList.get(tasksIndex) - 2);
                timeList.add(timeList.get(timeIndex));
                timeList.remove(0);
            }
        }
        System.out.printf("Congratulations, all tasks have been completed! Rubber ducks rewarded:%n" +
                "Darth Vader Ducky: %d%n" +
                "Thor Ducky: %d%n" +
                "Big Blue Rubber Ducky: %d%n" +
                "Small Yellow Rubber Ducky: %d%n", darthVaderDucky, thorDucky, bigBlueRubberDucky, smallYellowRubberDucky);
    }
}
