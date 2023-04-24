package JavaAdvance.StreamsFilesAndDirectories.Exercise;

import java.io.*;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        try {
            String wordPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
            String textPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\text.txt";
            BufferedReader wordReader = new BufferedReader(new FileReader(wordPath));
            BufferedReader textReader = new BufferedReader(new FileReader(textPath));
            String line = wordReader.readLine();
            LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();
            while (line != null) {
                String[] currentWords = line.split("\\s+");
                for (int i = 0; i < currentWords.length; i++) {
                    if (!wordMap.containsKey(currentWords[i])) {
                        wordMap.put(currentWords[i], 0);
                    } else {
                        wordMap.put(currentWords[i], wordMap.get(currentWords[i]) + 1);
                    }
                }
                line = wordReader.readLine();
            }
            line = textReader.readLine();
            while (line != null) {
                String[] currentWord = line.split("\\s+");
                for (int i = 0; i < currentWord.length; i++) {
                    if (wordMap.containsKey(currentWord[i])) {
                        wordMap.put(currentWord[i], wordMap.get(currentWord[i]) + 1);
                    }
                }
                line = textReader.readLine();
            }
            for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
                System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
