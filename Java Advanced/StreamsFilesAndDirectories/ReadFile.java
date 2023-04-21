package JavaAdvance.StreamsFilesAndDirectories;


import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\input.txt";
        try (FileInputStream input = new FileInputStream(path)) {
            int oneByte = input.read();
            while (oneByte >= 0) {
                System.out.printf("%s ",Integer.toBinaryString(oneByte));
                oneByte = input.read();
            }
        } catch (IOException e) {
        }
    }
}
