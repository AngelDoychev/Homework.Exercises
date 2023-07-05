package JavaOOP.Polymorphism.Exercise.Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    public String drive(double distance) {
        DecimalFormat df = new DecimalFormat("##.##");
        if (getFuelConsumption() * distance <= getFuelQuantity()) {
            setFuelQuantity(getFuelQuantity() - distance * getFuelConsumption());
            return String.format("%s travelled %s km", super.getClass().getSimpleName(), df.format(distance));
        } else {
            return super.getClass().getSimpleName() + " needs refueling";
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", super.getClass().getSimpleName(), getFuelQuantity());
    }

    public void refuel(double liters) {
        setFuelQuantity(getFuelQuantity() + liters);
    }
}
