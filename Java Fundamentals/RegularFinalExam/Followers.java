package Fundametals.RegularFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(": ");
        LinkedHashMap<String, Integer> followerInteractions = new LinkedHashMap<>();
        while (!command[0].equals("Log out")) {
            switch (command[0]) {
                case "New follower":
                    String name = command[1];
                    if (!followerInteractions.containsKey(name)) {
                        followerInteractions.put(name, 0);
                    }
                    break;
                case "Like":
                    String nameLiked = command[1];
                    int likeCount = Integer.parseInt(command[2]);
                    if (followerInteractions.containsKey(nameLiked)) {
                        followerInteractions.put(nameLiked, followerInteractions.get(nameLiked) + likeCount);
                    } else {
                        followerInteractions.put(nameLiked, likeCount);
                    }
                    break;
                case "Comment":
                    String nameComment = command[1];
                    if (followerInteractions.containsKey(nameComment)) {
                        followerInteractions.put(nameComment, followerInteractions.get(nameComment) + 1);
                    } else {
                        followerInteractions.put(nameComment, 1);
                    }
                    break;
                case "Blocked":
                    String nameDelete = command[1];
                    if (followerInteractions.containsKey(nameDelete)) {
                        followerInteractions.remove(nameDelete);
                    } else {
                        System.out.printf("%s doesn't exist.%n", nameDelete);
                    }
                    break;

            }
            command = scanner.nextLine().split(": ");
        }
        System.out.printf("%d followers%n", followerInteractions.size());
        for (Map.Entry<String, Integer> entry : followerInteractions.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
