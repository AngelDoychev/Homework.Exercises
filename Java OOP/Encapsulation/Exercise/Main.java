package JavaOOP.Encapsulation.Exercise.ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] personInfo = scanner.nextLine().split(";");
        String[] productInfo = scanner.nextLine().split(";");
        Map<String, Person> people = new LinkedHashMap<>();
        for (String currentInfo : personInfo) {
            String[] info = currentInfo.split("=");
            try {
                Person person = new Person(info[0], Double.parseDouble(info[1]));
                people.put(person.getName(), person);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }
        Map<String, Product> products = new LinkedHashMap<>();
        for (String currentInfo : productInfo) {
            String[] info = currentInfo.split("=");
            try {
                Product product = new Product(info[0], Double.parseDouble(info[1]));
                products.put(product.getName(), product);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("END")) {
            String currentName = command[0];
            String productToBuy = command[1];
            try {
                people.get(currentName).buyProduct(products.get(productToBuy));
                System.out.printf("%s bought %s%n", currentName, productToBuy);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            command = scanner.nextLine().split("\\s+");
        }
        people.values().forEach(System.out::println);
    }
}
