package JavaOOP.WorkingWithAbstraction.HotelReservations;

public class PriceCalculator {
    public static double calculatePrice(double pricePerDay, int numberOfDays, Season season, DiscountType typeOfDiscount) {
        double price = pricePerDay * numberOfDays;
        price *= season.getMultiplier();
        price *= (100 - typeOfDiscount.getDiscount()) / 100.0;
        return price;
    }
}
