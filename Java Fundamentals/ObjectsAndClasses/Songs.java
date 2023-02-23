package Fundametals.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Songs {
    static class Song {
        String listType;
        String name;
        String time;

        public Song(String listType, String name, String time) {
            this.listType = listType;
            this.name = name;
            this.time = time;
        }

        public String getListType() {
            return this.listType;
        }

        public String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songsList = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++) {
            String[] songInfo = scanner.nextLine().split("_");
            String typeList = songInfo[0];
            String name = songInfo[1];
            String time = songInfo[2];
            Song currentSong = new Song(typeList, name, time);
            songsList.add(currentSong);
        }
        String listToPrint = scanner.nextLine();
        if (listToPrint.equals("all")) {
            for (Song song : songsList) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songsList) {
                if (listToPrint.equals(song.getListType())) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
