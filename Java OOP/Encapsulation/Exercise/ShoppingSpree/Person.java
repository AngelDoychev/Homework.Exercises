package JavaOOP.Encapsulation.Exercise.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (products.size() > 0) {
            result.append(String.join(", ", this.products.stream().map(e -> e.getName()).collect(Collectors.toList())));
        } else {
            result.append("Nothing bought");
        }
        return String.format("%s - %s", this.name, result);
    }

    public void buyProduct(Product product) {
        if (money < product.getCost()) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }
        this.products.add(product);
        this.money -= product.getCost();
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }
}
