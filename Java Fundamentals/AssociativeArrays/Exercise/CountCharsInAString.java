package Fundametals.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\s+");
        String fullText = String.join("", text);
        LinkedHashMap<String, Integer> textMap = new LinkedHashMap<>();
        for (int i = 0; i < fullText.length(); i++) {
            String currentLetter = Character.toString(fullText.charAt(i));
            if (!textMap.containsKey(currentLetter)) {
                textMap.put(currentLetter, 0);
            }
            textMap.put(currentLetter, textMap.get(currentLetter) + 1);
        }
        for (Map.Entry<String, Integer> entry : textMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
