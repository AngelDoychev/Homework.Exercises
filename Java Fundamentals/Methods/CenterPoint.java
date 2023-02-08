package FirstStepsInCoding.Fundamentals.Methods.MoreExercises;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int num1 = Math.abs(x1+y1);
        int num2 = Math.abs(x2+y2);
        closestPoint(num1, num2, x1, x2, y1, y2);
    }
    public static void closestPoint(int num1, int num2, int x1, int x2, int y1, int y2){
        if (num1>num2){
            System.out.printf("(%d, %d)", x2, y2);
        } else {
            System.out.printf("(%d, %d)", x1, y1);
        }
    }
}
