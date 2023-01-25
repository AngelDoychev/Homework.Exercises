package FirstStepsInCoding.Fundamentals.Arrays;

import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (day >= 1 && day <= 7) {
            System.out.printf("%s", daysOfWeek[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
