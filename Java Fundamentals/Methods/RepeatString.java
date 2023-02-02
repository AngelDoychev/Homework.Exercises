package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(multiplyText(text, n));
    }

    public static String multiplyText(String text, int n) {
        String multipliedText = "";
        for (int i = 0; i < n; i++) {
            multipliedText = multipliedText + text;
        }
        return multipliedText;
    }
}
