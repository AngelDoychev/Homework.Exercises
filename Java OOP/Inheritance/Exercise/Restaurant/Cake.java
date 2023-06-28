package JavaOOP.Inheritance.Exercise.restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert{
    public final static double CAKE_GRAMS = 250;
    public final static double CAKE_CALORIES = 1000;
    public final static BigDecimal CAKE_Price = BigDecimal.valueOf(5);
    public Cake(String name) {
        super(name, CAKE_Price, CAKE_GRAMS, CAKE_CALORIES);
    }
}
