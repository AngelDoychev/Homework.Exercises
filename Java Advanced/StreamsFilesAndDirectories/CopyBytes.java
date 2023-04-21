package JavaAdvance.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {
        String inPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\input.txt";
        String outPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\03.CopyBytesOutput.txt";
        try {
            FileInputStream input = new FileInputStream(inPath);
            FileOutputStream output = new FileOutputStream(outPath);
            int oneByte = input.read();
            while (oneByte >= 0) {
                if (oneByte == ' ' || oneByte == '\n') {
                    output.write(oneByte);
                } else {
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++) {
                        output.write(digits.charAt(i));
                    }
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
