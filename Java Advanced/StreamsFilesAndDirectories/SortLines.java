package JavaAdvance.StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String input = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\input.txt";
        String output = "C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\06.SortLinesOutput.txt";
        Path inPath = Paths.get(input);
        Path outPath = Paths.get(output);
        List<String> list = Files.readAllLines(inPath);
        Collections.sort(list);
        Files.write(outPath, list);
    }
}
