package JavaOOP.Encapsulation.Exercise.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        switch (toppingType) {
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType = toppingType;
                break;
            default:
                throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double toppingCalories = 0;
        switch (toppingType) {
            case "Meat":
                toppingCalories = 1.2;
                break;
            case "Veggies":
                toppingCalories = 0.8;
                break;
            case "Cheese":
                toppingCalories = 1.1;
                break;
            case "Sauce":
                toppingCalories = 0.9;
                break;
        }
        return (2 * this.weight) * toppingCalories;
    }
}
