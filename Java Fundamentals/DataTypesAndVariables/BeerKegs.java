package FirstStepsInCoding.Fundamentals.DataTypesAmdVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kegs = Integer.parseInt(scanner.nextLine());
        double biggestKegV = Double.MIN_VALUE;
        String biggestKegName = "";
        for (int i = 1; i <=kegs; i++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * (radius * radius) * height;
            if (volume>biggestKegV){
                biggestKegV=volume;
                biggestKegName = name;
            }
        }
        System.out.println(biggestKegName);
    }
}
