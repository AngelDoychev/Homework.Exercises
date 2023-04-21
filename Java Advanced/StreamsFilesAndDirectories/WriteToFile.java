package JavaAdvance.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String inPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\input.txt";
        String outPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\02.WriteToFileOutput.txt";
        try {
            FileInputStream input = new FileInputStream(inPath);
            FileOutputStream output = new FileOutputStream(outPath);
            int oneByte = input.read();
            while (oneByte >= 0) {
                if ((char) oneByte != ',' && (char) oneByte != '.' && (char) oneByte != '!' && (char) oneByte != '?') {
                    output.write(oneByte);
                }
                oneByte = input.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
