package JavaAdvance.PastExams.PastExam04;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] caffeineInput = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] energyDrinksInput = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> caffeineStack = new ArrayDeque<>();
        Deque<Integer> energyDrinkQueue = new ArrayDeque<>();
        for (int current : caffeineInput) {
            caffeineStack.push(current);
        }
        for (int current : energyDrinksInput) {
            energyDrinkQueue.offer(current);
        }
        int totalCaffeine = 0;
        int limit = 300;
        while (!caffeineStack.isEmpty() && !energyDrinkQueue.isEmpty()) {
            int result = caffeineStack.peek() * energyDrinkQueue.peek();
            if (result <= limit) {
                caffeineStack.pop();
                energyDrinkQueue.poll();
                totalCaffeine += result;
                limit -= result;
            } else {
                caffeineStack.pop();
                    Integer temp = energyDrinkQueue.peek();
                    energyDrinkQueue.poll();
                    energyDrinkQueue.offer(temp);
                    totalCaffeine -= 30;
                    limit += 30;
            }
            if (limit < 0) {
                limit = 0;
            }
            if (totalCaffeine < 0) {
                totalCaffeine = 0;
            }
            if (limit > 300) {
                limit = 300;
            }
            if (totalCaffeine > 300) {
                totalCaffeine = 300;
            }
        }
        if (!energyDrinkQueue.isEmpty()) {
            System.out.print("Drinks left: ");
            for (int i = 0; i < energyDrinkQueue.size() - 1; i++) {
                System.out.print(energyDrinkQueue.poll() + ", ");
                i--;
            }
            System.out.println(energyDrinkQueue.poll());
        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }
        System.out.printf("Stamat is going to sleep with %d mg caffeine.%n", totalCaffeine);
    }
}
