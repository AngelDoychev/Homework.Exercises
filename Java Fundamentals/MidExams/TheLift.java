package MidExams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean noPeopleWaiting = false;
        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < wagons.size(); i++) {
            if (wagons.get(i) == 4) {
                continue;
            } else if (wagons.get(i) == 3) {
                wagons.set(i, 4);
                peopleWaiting--;
                if (peopleWaiting <= 0) {
                    wagons.set(i, 4 - Math.abs(peopleWaiting));
                    noPeopleWaiting = true;
                    break;
                }
            } else if (wagons.get(i) == 2) {
                wagons.set(i, 4);
                peopleWaiting -= 2;
                if (peopleWaiting <= 0) {
                    wagons.set(i, 4 - Math.abs(peopleWaiting));
                    noPeopleWaiting = true;
                    break;
                }
            } else if (wagons.get(i) == 1) {
                wagons.set(i, 4);
                peopleWaiting -= 3;
                if (peopleWaiting <= 0) {
                    wagons.set(i, 4 - Math.abs(peopleWaiting));
                    noPeopleWaiting = true;
                    break;
                }
            } else if (wagons.get(i) == 0) {
                wagons.set(i, 4);
                peopleWaiting -= 4;
                if (peopleWaiting <= 0) {
                    wagons.set(i, 4 - Math.abs(peopleWaiting));
                    noPeopleWaiting = true;
                    break;
                }
            }
        }
        boolean isNotFull = false;
        for (int i = 0; i < wagons.size(); i++) {
            if (wagons.get(i) < 4) {
                isNotFull = true;
            }
        }
        if (peopleWaiting > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting);
            for (int wagon : wagons) {
                System.out.print(wagon + " ");
            }
        } else if (noPeopleWaiting && !isNotFull) {
            for (int wagon : wagons) {
                System.out.print(wagon + " ");
            }
        } else if (isNotFull && noPeopleWaiting) {
            System.out.println("The lift has empty spots!");
            for (int wagon : wagons) {
                System.out.print(wagon + " ");
            }
        }
    }
}
