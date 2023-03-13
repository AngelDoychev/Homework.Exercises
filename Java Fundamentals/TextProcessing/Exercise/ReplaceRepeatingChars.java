package Fundametals.TextProcessing.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder newWord = new StringBuilder();
        ArrayList<Character> letterList = new ArrayList<>();
        char[] letters = text.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            letterList.add(letters[i]);
        }
        for (int i = 0; i < letterList.size() - 1; i++) {
            if (letterList.get(i) == letterList.get(i + 1)) {
                letterList.remove(0);
                i--;
            } else {
                newWord.append(letterList.get(i));
            }
        }
        newWord.append(letterList.get(letterList.size() - 1));
        System.out.println(newWord);
    }
}
