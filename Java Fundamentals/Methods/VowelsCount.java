package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        vowelChecker(text);
    }

    public static void vowelChecker(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'u' || text.charAt(i) == 'o' || text.charAt(i) == 'e' || text.charAt(i) == 'i' ||
                    text.charAt(i) == 'A' || text.charAt(i) == 'U' || text.charAt(i) == 'O' || text.charAt(i) == 'E' || text.charAt(i) == 'I') {
                count++;
            }
        }
        System.out.println(count);
    }
}
