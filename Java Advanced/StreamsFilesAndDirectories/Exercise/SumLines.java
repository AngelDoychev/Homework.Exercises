package JavaAdvance.StreamsFilesAndDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) {
        try {
            String inPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
            BufferedReader reader = new BufferedReader(new FileReader(inPath));
            String line = reader.readLine();
            while (line != null) {
                long sum = 0;
                for (char ch : line.toCharArray()) {
                    sum += ch;
                }
                System.out.println(sum);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
