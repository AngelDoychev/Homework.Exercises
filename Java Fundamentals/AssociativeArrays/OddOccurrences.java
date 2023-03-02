package Fundametals.AssociativeArrays;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        for (String word : words) {
            String wordLowerCase = word.toLowerCase();
            if (!wordsMap.containsKey(wordLowerCase)) {
                wordsMap.put(wordLowerCase, 0);
            }
            wordsMap.put(wordLowerCase, wordsMap.get(wordLowerCase) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                list.add(entry.getKey());
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.printf("%s, ", list.get(i));
        }
        System.out.println(list.get(list.size() - 1));
    }
}
