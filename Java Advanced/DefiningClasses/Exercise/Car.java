package JavaAdvance.DefiningClasses.Exercise.CarSalesman;

public class Car {
    private String model;
    private String engine;
    private String weight = "n/a";
    private String color = "n/a";

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car(String model, String engine, String weight) {
        this(model, engine);
        if (Character.isDigit(weight.charAt(0))) {
            this.weight = weight;
        } else {
            this.color = weight;
        }
    }

    public Car(String model, String engine, String weight, String color) {
        this(model, engine, weight);
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
