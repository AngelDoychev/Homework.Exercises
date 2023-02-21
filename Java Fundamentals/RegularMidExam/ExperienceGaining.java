package Fundametals.Lists.RegularMidExam;

import java.util.Scanner;

public class ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double expNeeded = Double.parseDouble(scanner.nextLine());
        int battles = Integer.parseInt(scanner.nextLine());
        double totalExp = 0;
        boolean check = false;
        int count = 0;
        for (int i = 1; i <= battles; i++) {
            count++;
            double expGained = Double.parseDouble(scanner.nextLine());
            if (i % 3 == 0) {
                expGained *= 1.15;
            }
            if (i % 5 == 0) {
                expGained *= 0.9;
            }
            if (i % 15 == 0) {
                expGained *= 1.05;
            }
            totalExp += expGained;
            if (totalExp >= expNeeded) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", count);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", expNeeded - totalExp);
        }
    }
}
