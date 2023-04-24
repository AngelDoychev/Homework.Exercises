package JavaAdvance.StreamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) {
        String inPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\input.txt";
        String outPath = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\05.WriteEveryThirdLineOutput.txt";
        try {
            Scanner in = new Scanner(new FileReader(inPath));
            PrintWriter out = new PrintWriter(new FileWriter(outPath));
            String line = in.nextLine();
            int count = 1;
            while (in.hasNextLine()) {
                if (count % 3 == 0) {
                    out.println(line);
                }
                count++;
                line = in.nextLine();
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
