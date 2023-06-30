package JavaOOP.IntefacesAndAbstraction.Exercise.Telephony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersInput = scanner.nextLine().split("\\s+");
        List<String> numbersList = new ArrayList<>(Arrays.asList(numbersInput));
        String[] urlsInput = scanner.nextLine().split("\\s+");
        List<String> urlsList = new ArrayList<>(Arrays.asList(urlsInput));
        Smartphone smartphone = new Smartphone(numbersList, urlsList);
        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}
