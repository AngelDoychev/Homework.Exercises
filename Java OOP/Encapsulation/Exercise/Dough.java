package JavaOOP.Encapsulation.Exercise.PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        switch (flourType) {
            case "White":
            case "Wholegrain":
                this.flourType = flourType;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique) {
            case "Crispy":
            case "Chewy":
            case "Homemade":
                this.bakingTechnique = bakingTechnique;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double flourTypeCalories = 0;
        double bakingStyleCalories = 0;
        switch (flourType) {
            case "White":
                flourTypeCalories = 1.5;
                break;
            case "Wholegrain":
                flourTypeCalories = 1.0;
                break;
        }
        switch (bakingTechnique) {
            case "Crispy":
                bakingStyleCalories = 0.9;
                break;
            case "Chewy":
                bakingStyleCalories = 1.1;
                break;
            case "Homemade":
                bakingStyleCalories = 1.0;
                break;
        }
        return (2 * this.weight) * flourTypeCalories * bakingStyleCalories;
    }
}
