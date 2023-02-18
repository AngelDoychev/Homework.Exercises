package MidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> houses = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scanner.nextLine().split("\\s+");
        int lastPosition = 0;
        int i = 0;
        while (!command[0].equals("Love!")) {
            int lengthOfJump = Integer.parseInt(command[1]);
            if (command[0].equals("Jump")) {
                i = lastPosition;
                i += lengthOfJump;
                if (i >= houses.size()) {
                    i = 0;
                }
                lastPosition = i;
                if (houses.get(i) == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", i);
                } else {
                    houses.set(i, houses.get(i) - 2);
                    if (houses.get(i) == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", i);
                    }
                }
            }
            command = scanner.nextLine().split("\\s+");
        }
        int count = houses.size();
        for (int j = 0; j < houses.size(); j++) {
            if (houses.get(j) == 0) {
                count--;
            }
        }
        System.out.printf("Cupid's last position was %d.%n", lastPosition);
        if (count == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n", count);
        }
    }
}
