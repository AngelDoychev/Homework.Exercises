package FirstStepsInCoding.Fundamentals.DataTypesAmdVariables;

import java.util.Scanner;

public class CenturiestoMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte centuries = Byte.parseByte(scanner.nextLine());
        int years = centuries * 100;
        double days = years * 365.2422 ;
        double hours = days * 24;
        double minutes = hours * 60;
        System.out.printf("%01d centuries = %01d years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);
    }
}
