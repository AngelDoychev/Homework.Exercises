package JavaOOP.WorkingWithAbstraction.HotelReservations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double pricePerDay = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        String season = input[2];
        String typeOfDiscount = input[3];
        System.out.printf("%.2f%n", PriceCalculator.calculatePrice(pricePerDay, days, Season.valueOf(season), DiscountType.valueOf(typeOfDiscount)));
    }
}
