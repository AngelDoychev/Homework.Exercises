package MidExams;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int maxLectures = 0;
        for (int i = 0; i < students; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            double bonus = Math.ceil(attendance * 1.0 / lectures * (5 + additionalBonus));
            if (maxBonus <= bonus) {
                maxBonus = bonus;
                maxLectures = attendance;
            }
        }
        System.out.printf("Max Bonus: %01.0f.%nThe student has attended %d lectures.%n", maxBonus, maxLectures);
    }
}
