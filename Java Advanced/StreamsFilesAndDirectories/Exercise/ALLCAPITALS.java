package JavaAdvance.StreamsFilesAndDirectories.Exercise;

import java.io.*;

public class ALLCAPITALS {
    public static void main(String[] args) {
        try {
            String inPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";
            String outPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt";
            BufferedReader reader = new BufferedReader(new FileReader(inPath));
            PrintWriter writer = new PrintWriter(new File(outPath));
            String line = reader.readLine();
            while (line != null) {
                for (char ch : line.toCharArray()) {
                   ch = Character.toUpperCase(ch);
                    writer.print(ch);
                }
                writer.flush();
                writer.println();
                line = reader.readLine();
            }
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
