package JavaAdvance.StreamsFilesAndDirectories.Exercise;


import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class GetFolderSize {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Angel\\IdeaProjects\\untitled\\src\\JavaAdvance\\StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources");
        int totalBytes = 0;
        Deque<File> directories = new ArrayDeque<>();
        directories.offer(folder);
        while (!directories.isEmpty()) {
            File current = directories.poll();
            File[] files = current.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    directories.offer(file);
                } else {
                    totalBytes += file.length();
                }
            }
        }
        System.out.println("Folder size: " + totalBytes);
    }
}


