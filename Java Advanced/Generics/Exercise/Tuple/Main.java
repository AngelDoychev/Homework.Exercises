package JavaAdvance.Generics.Exercise.Tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] info = scanner.nextLine().split("\\s+");
        Tuple<String, String> nameAndCity = new Tuple<>(info[0] + " " + info[1], info[2]);
        System.out.println(nameAndCity);
        info = scanner.nextLine().split("\\s+");
        Tuple<String, Integer> nameAndAge = new Tuple<>(info[0], Integer.parseInt(info[1]));
        System.out.println(nameAndAge);
        info = scanner.nextLine().split("\\s+");
        Tuple<Integer, Double> numbersTuple = new Tuple<>(Integer.parseInt(info[0]), Double.parseDouble(info[1]));
        System.out.println(numbersTuple);
    }
}
