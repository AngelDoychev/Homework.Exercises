package JavaAdvance.StreamsFilesAndDirectories.Exercise;

import java.io.*;

public class LineNumbers {
    public static void main(String[] args) {
        try {
            String inPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
            String outPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt";
            BufferedReader reader = new BufferedReader(new FileReader(inPath));
            PrintWriter writer = new PrintWriter(outPath);
            String line = reader.readLine();
           int count = 1;
            while (line != null) {
                writer.print(count+". "+line);
                writer.flush();
                line = reader.readLine();
                count++;
                writer.println();
            }
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
