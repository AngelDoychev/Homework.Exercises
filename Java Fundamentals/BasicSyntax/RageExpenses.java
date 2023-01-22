package FirstStepsInCoding.Fundamentals.BasicSyntax;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int headsets = 0;
        int mice = 0;
        int keyboards = 0;
        int displays = 0;
        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                headsets++;
            }
            if (i % 3 == 0) {
                mice++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                keyboards++;
                if (keyboards % 2 == 0) {
                    displays++;
                }
            }
        }
        double total = headsets * headsetPrice + mousePrice * mice + keyboards * keyboardPrice + displayPrice * displays;
        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
