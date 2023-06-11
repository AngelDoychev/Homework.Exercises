package JavaAdvance.PastExams.PastExam03;

import java.util.*;

public class ClimbThePeaks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] foodArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] staminaArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> foodStack = new ArrayDeque<>();
        Deque<Integer> staminaQueue = new ArrayDeque<>();
        for (int current : foodArr) {
            foodStack.push(current);
        }
        for (int current : staminaArr) {
            staminaQueue.offer(current);
        }
        List<Integer> list = new ArrayList<>();
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(60);
        list.add(70);
        HashMap<String, Boolean> completedPeeksMap = new LinkedHashMap<>();
        completedPeeksMap.put("Vihren", false);
        completedPeeksMap.put("Kutelo", false);
        completedPeeksMap.put("Banski Suhodol", false);
        completedPeeksMap.put("Polezhan", false);
        completedPeeksMap.put("Kamenitza", false);
        for (int i = 0; i < 7; i++) {
            int result = 0;
            if (!foodStack.isEmpty() && !staminaQueue.isEmpty()) {
                result = foodStack.peek() + staminaQueue.peek();
            }
            if (!list.isEmpty()) {
                if (result >= list.get(0)) {
                    list.remove(0);
                    foodStack.pop();
                    staminaQueue.poll();
                    for (Map.Entry<String, Boolean> entry : completedPeeksMap.entrySet()) {
                        if (!entry.getValue()) {
                            entry.setValue(true);
                            break;
                        }
                    }
                } else {
                    foodStack.pop();
                    staminaQueue.poll();
                }
            }
        }
        if (list.isEmpty()) {
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
            System.out.println("Conquered peaks:");
            completedPeeksMap.entrySet().stream().filter(Map.Entry::getValue).forEach(e -> System.out.println(e.getKey()));
        } else {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
            if (list.size() != 5) {
                System.out.println("Conquered peaks:");
                completedPeeksMap.entrySet().stream().filter(Map.Entry::getValue).forEach(e -> System.out.println(e.getKey()));
            }
        }
    }
}