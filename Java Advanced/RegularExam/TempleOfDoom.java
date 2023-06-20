package JavaAdvance.RegularExam;

import java.util.*;
import java.util.stream.Collectors;

public class TempleOfDoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tools = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] substances = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        List<Integer> challenges = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Deque<Integer> toolsQueue = new ArrayDeque<>();
        Deque<Integer> substancesStack = new ArrayDeque<>();
        for (int current : tools) {
            toolsQueue.offer(current);
        }
        for (int current : substances) {
            substancesStack.push(current);
        }
        while (!toolsQueue.isEmpty() && !substancesStack.isEmpty()) {
            int result = toolsQueue.peek() * substancesStack.peek();
            boolean hasElement = false;
            for (Integer current : challenges) {
                if (result == current) {
                    hasElement = true;
                }
            }
            if (hasElement) {
                challenges.remove(challenges.indexOf(result));
                toolsQueue.poll();
                substancesStack.pop();
            } else {
                int temp = toolsQueue.peek() + 1;
                toolsQueue.poll();
                toolsQueue.offer(temp);
                temp = substancesStack.peek() - 1;
                substancesStack.pop();
                if (temp > 0) {
                    substancesStack.push(temp);
                }
            }
        }
        if (challenges.isEmpty()) {
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        } else {
            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
        }
        if (!toolsQueue.isEmpty()) {
            System.out.print("Tools: ");
            for (int i = 0; i < toolsQueue.size() - 1; i++) {
                System.out.print(toolsQueue.poll() + ", ");
                i--;
            }
            System.out.println(toolsQueue.poll());
        }
        if (!substancesStack.isEmpty()) {
            System.out.print("Substances: ");
            for (int i = 0; i < substancesStack.size() - 1; i++) {
                System.out.print(substancesStack.pop() + ", ");
                i--;
            }
            System.out.println(substancesStack.pop());
        }
        if (!challenges.isEmpty()) {
            System.out.print("Challenges: ");
            for (int i = 0; i < challenges.size() - 1; i++) {
                System.out.print(challenges.get(i) + ", ");
            }
            System.out.println(challenges.get(challenges.size() - 1));
        }
    }
}
