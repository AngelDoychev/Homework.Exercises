package JavaAdvance.DefiningClasses.Exercise.CarSalesman;

public class Engine {
    private String model;
    private String power;
    private String displacement = "n/a";
    private String efficiency = "n/a";

    public Engine(String model, String power) {
        this.model = model;
        this.power = power;
    }

    public Engine(String model, String power, String displacement) {
        this(model, power);
        if (Character.isDigit(displacement.charAt(0))) {
            this.displacement = displacement;
        } else {
            this.efficiency = displacement;
        }
    }


    public Engine(String model, String power, String displacement, String efficiency) {
        this(model, power, displacement);
        this.efficiency = efficiency;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public String getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
