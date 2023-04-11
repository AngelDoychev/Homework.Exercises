package JavaAdvance.StacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> kids = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> kidsQueue = new ArrayDeque<>();
        for (String kid : kids) {
            kidsQueue.offer(kid);
        }
        while (!kidsQueue.isEmpty()) {
            for (int i = 1; i < n; i++) {
               kidsQueue.offer(kidsQueue.poll());
            }
            if (kidsQueue.size() == 1) {
                System.out.println("Last is " + kidsQueue.poll());
            } else {
                System.out.println("Removed " + kidsQueue.poll());
            }
        }
    }
}
