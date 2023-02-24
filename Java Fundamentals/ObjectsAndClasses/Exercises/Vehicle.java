package Fundametals.ObjectsAndClasses.Exercises.VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        String first = this.type.substring(0, 1);
        String afterfirst = this.type.substring(1);
        String capitalizeType = this.type.substring(0, 1).toUpperCase() + this.type.substring(1);
        String first1 = this.type.substring(0, 1);
        String afterfirst1 = this.model.substring(1);
        String capitalizeModel = this.model.substring(0, 1).toUpperCase() + this.model.substring(1);
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n", capitalizeType, capitalizeModel, this.color, this.horsePower);
    }
}
