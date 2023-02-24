package Fundametals.ObjectsAndClasses.Exercises.OpinionPoll;

import java.util.Scanner;

public class OpinionPollMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < people; i++) {
            String[] info = scanner.nextLine().split(" ");
            Person person = new Person(info[0], Integer.parseInt(info[1]));
            if (isOldEnough(Integer.parseInt(info[1]))) {
                System.out.println(person);
            }
        }
    }

    public static boolean isOldEnough(int age) {
        if (age > 30) {
            return true;
        }
        return false;
    }
}
