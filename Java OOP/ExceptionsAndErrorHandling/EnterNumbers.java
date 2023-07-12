package JavaOOP.ExceptionsAndErrorHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnterNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (list.size() < 10) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (list.size() == 0 && number > 1 && number < 100) {
                    list.add(input);
                    continue;
                } else {
                    if (list.size() != 0 && number > Integer.parseInt(list.get(list.size() - 1)) && number < 100) {
                        list.add(input);
                        continue;
                    }
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid Number!");
                continue;
            }
            if (list.size() == 0) {
                System.out.println("Your number is not in range 1 - 100!");
            } else {
                System.out.printf("Your number is not in range %s - 100!%n", list.get(list.size() - 1));
            }
        }
        System.out.println(String.join(", ", list));
    }
}
