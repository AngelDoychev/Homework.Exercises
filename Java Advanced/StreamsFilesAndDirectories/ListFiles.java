package JavaAdvance.StreamsFilesAndDirectories;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\Files-and-Streams");
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File currentFile : files) {
                    if (!currentFile.isDirectory()) {
                        System.out.printf("%s: [%s]%n", currentFile.getName(), currentFile.length());
                    }
                }
            }
        }
    }
}
