package JavaOOP.IntefacesAndAbstraction.CarShopExtended;

public class Seat extends CarImpl implements Sellable {
    private double price;

    public Seat(String model, String color, Integer horsePower, String country, double price) {
        super(model, color, horsePower, country);
        this.price = price;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("%n%s sells for %f", getModel(), getPrice());
    }
    @Override
    public double getPrice() {
        return this.price;
    }

}
