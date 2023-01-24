package FirstStepsInCoding.Fundamentals.DataTypesAmdVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());
        int totalMined = 0;
        int days = 0;
        while (yield >= 100) {
            days++;
            totalMined += yield - 26;
            yield -= 10;
        }
        if (totalMined>=26){
            totalMined -= 26;
        }
        System.out.printf("%d%n%d", days, totalMined);
    }
}
