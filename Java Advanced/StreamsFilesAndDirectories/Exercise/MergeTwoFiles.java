package JavaAdvance.StreamsFilesAndDirectories.Exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MergeTwoFiles {
    public static void main(String[] args) {
        String input1 = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputOne.txt";
        String input2 = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputTwo.txt";
        String output = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt";
        try {
            FileInputStream reader = new FileInputStream(input1);
            FileOutputStream writer = new FileOutputStream(output);
            int input = reader.read();
            while (input >= 0) {
                writer.write(input);
                input = reader.read();
            }
            FileInputStream reader2 = new FileInputStream(input2);
            input = reader2.read();
            writer.write('\n');
            while (input >= 0) {
                writer.write(input);
                input = reader2.read();
            }
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
