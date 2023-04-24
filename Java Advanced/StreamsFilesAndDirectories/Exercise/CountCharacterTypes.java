package JavaAdvance.StreamsFilesAndDirectories.Exercise;

import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {
        try {
            String inPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";
            String outPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt";
            BufferedReader reader = new BufferedReader(new FileReader(inPath));
            PrintWriter writer = new PrintWriter(new File(outPath));
            String line = reader.readLine();
            int countVowels = 0;
            int countOther = 0;
            int countPunctuation = 0;
            while (line != null) {
                for (char ch : line.toCharArray()) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        countVowels++;
                    } else if (ch == '?' || ch == '!' || ch == '.' || ch == ',') {
                        countPunctuation++;
                    } else if (ch == ' ') {
                    } else {
                        countOther++;
                    }
                }
                writer.flush();
                line = reader.readLine();
            }
            writer.printf("Vowels: %d%nOther symbols: %d%nPunctuation: %d%n", countVowels, countOther, countPunctuation);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
