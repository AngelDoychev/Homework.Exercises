package JavaOOP.Encapsulation.Exercise.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] pizzaInfo = scanner.nextLine().split("\\s+");
        String pizzaName = pizzaInfo[1];
        int pizzaToppings = Integer.parseInt(pizzaInfo[2]);
        Pizza pizza;
        try {
            pizza = new Pizza(pizzaName, pizzaToppings);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        String[] doughInfo = scanner.nextLine().split("\\s+");
        String flourType = doughInfo[1];
        String bakingStyle = doughInfo[2];
        double doughWeight = Double.parseDouble(doughInfo[3]);
        try {
            Dough dough = new Dough(flourType, bakingStyle, doughWeight);
            pizza.setDough(dough);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        String[] toppingInfo = scanner.nextLine().split("\\s+");
        while (!toppingInfo[0].equals("END")) {
            String toppingType = toppingInfo[1];
            double toppingWeight = Double.parseDouble(toppingInfo[2]);
            try {
                Topping currentTopping = new Topping(toppingType, toppingWeight);
                pizza.addTopping(currentTopping);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
            toppingInfo = scanner.nextLine().split("\\s+");
        }
        System.out.printf("%s - %.2f%n", pizza.getName(), pizza.getOverallCalories());
    }
}
