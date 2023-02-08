package FirstStepsInCoding.Fundamentals.Methods.MoreExercises;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String input = scanner.nextLine();
        switch(type){
            case"int":
                int num = Integer.parseInt(input);
                ifInt(num);
                break;
            case"real":
                double num2 = Double.parseDouble(input);
                ifReal(num2);
                break;
            case"string":
                ifString(input);
                break;
        }
    }
    public static void ifInt(int a){
        System.out.println(a*2);
    }
    public static void ifReal(double a){
        System.out.printf("%.2f",(a*1.5));
    }
    public static void ifString(String a){
        System.out.println("$"+a+"$");
    }
}
