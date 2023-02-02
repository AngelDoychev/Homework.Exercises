package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        System.out.println(rectangleAreaCal(width, lenght));
    }

    public static int rectangleAreaCal(int width, int lenght) {
        int result = width * lenght;
        return result;
    }
}
