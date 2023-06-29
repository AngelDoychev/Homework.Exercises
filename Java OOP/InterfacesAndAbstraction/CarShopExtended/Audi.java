package JavaOOP.IntefacesAndAbstraction.CarShopExtended;


public class Audi extends CarImpl implements Rentable {
    private Integer minRentDay;
    private double pricePerDay;


    public Audi(String model, String color, Integer horsePower, String country, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, country);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nMinimum rental period of %d days. Price per day %f", getMinRentDay(), getPricePerDay());
    }

    @Override
    public double getPricePerDay() {
        return this.pricePerDay;
    }
}
