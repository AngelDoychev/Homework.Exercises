package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class GreaterofTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int":
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println(typeInt(a, b));
                break;
            case "char":
                char ch1 = scanner.nextLine().charAt(0);
                char ch2 = scanner.nextLine().charAt(0);
                System.out.println((char) typeChar(ch1, ch2));
                break;
            case "string":
                String text1 = scanner.nextLine();
                String text2 = scanner.nextLine();
                System.out.println(typeString(text1, text2));
                break;
        }
    }

    public static int typeInt(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        return Math.max(a, b);
    }

    public static int typeChar(char a, char b) {
        Scanner scanner = new Scanner(System.in);
        return Math.max(a, b);
    }

    public static String typeString(String a, String b) {
        Scanner scanner = new Scanner(System.in);
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }
}
