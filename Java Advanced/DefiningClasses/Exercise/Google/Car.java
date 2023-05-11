package JavaAdvance.DefiningClasses.Exercise.Google;

public class Car {
    private String model = "";
    private String speed = "";

    @Override
    public String toString() {
        return String.format("Car:%n%s %s", this.model, this.speed);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getSpeed() {
        return speed;
    }
}
