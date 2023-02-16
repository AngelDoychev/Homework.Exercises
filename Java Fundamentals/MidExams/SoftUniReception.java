package MidExams;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employee1 = Integer.parseInt(scanner.nextLine());
        int employee2 = Integer.parseInt(scanner.nextLine());
        int employee3 = Integer.parseInt(scanner.nextLine());
        int allPerHour = employee1 + employee2 + employee3;
        int students = Integer.parseInt(scanner.nextLine());
        int countHours = 0;
        while (students > 0) {
            countHours++;
            if (countHours % 4 == 0) {
                countHours++;
            }
            students -= allPerHour;
        }
        System.out.printf("Time needed: %dh.", countHours);
    }
}
