package JavaAdvance.StacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> kidsList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        PriorityQueue<String> kidsQueue = new PriorityQueue<>();
        for (String kid : kidsList) {
            kidsQueue.offer(kid);
        }
        int cycle = 1;
        while (kidsQueue.size() > 0) {
            for (int i = 1; i < n; i++) {
                kidsQueue.offer(kidsQueue.poll());
            }
            if (isPrime(cycle) && kidsQueue.size() > 1) {
                System.out.println("Prime " + kidsQueue.peek());
            } else {
                if (kidsQueue.size() == 1) {
                    System.out.println("Last is " + kidsQueue.poll());
                } else {
                    System.out.println("Removed " + kidsQueue.poll());
                }
            }
            cycle++;
        }
    }

    public static boolean isPrime(int n) {
        boolean isPrimeNumber = true;
        if (n <= 1) {
            isPrimeNumber = false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrimeNumber = false;
            }
        }
        return isPrimeNumber;
    }
}
