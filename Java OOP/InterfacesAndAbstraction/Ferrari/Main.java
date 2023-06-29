package JavaOOP.IntefacesAndAbstraction.Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String driver = scanner.nextLine();
        Ferrari ferrari = new Ferrari(driver);
        System.out.println(ferrari);
    }
}
