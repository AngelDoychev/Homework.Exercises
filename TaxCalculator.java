package Fundametals.Lists.RegularMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cars = Arrays.stream(scanner.nextLine().split(">>")).collect(Collectors.toList());
        double collectedFromNationalRevenueAgency = 0;
        for (int i = 0; i < cars.size(); i++) {
            double totalTax = 0;
            List<String> info = Arrays.stream(cars.get(i).split("\\s+")).collect(Collectors.toList());
            String carType = info.get(0);
            int years = Integer.parseInt(info.get(1));
            int kmTraveled = Integer.parseInt(info.get(2)) / 1000;
            boolean check = false;
            switch (carType) {
                case "family":
                    totalTax = 50 - (years * 5) + (Math.floor(kmTraveled * 1.0 / 3) * 12);
                    break;
                case "heavyDuty":
                    totalTax = 80 - (years * 8) + (Math.floor(kmTraveled * 1.0 / 9) * 14);
                    break;
                case "sports":
                    totalTax = 100 - (years * 9) + (Math.floor(kmTraveled * 1.0 / 2) * 18);
                    break;
                default:
                    System.out.println("Invalid car type.");
                    check = true;
                    break;
            }
            if (check) {
                continue;
            }
            System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, totalTax);
            collectedFromNationalRevenueAgency += totalTax;
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", collectedFromNationalRevenueAgency);
    }
}
