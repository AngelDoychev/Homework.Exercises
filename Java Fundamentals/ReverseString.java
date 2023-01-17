package FirstStepsInCoding.Fundamentals.BasicSyntax.MoreExercises;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String word = scanner.nextLine();
String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            char ch;
            ch = word.charAt(i);
            newWord = ch + newWord;
        }
        System.out.println(newWord);
    }
}
