package Fundametals.FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, String>> piecesMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] pianoPieces = scanner.nextLine().split("\\|");
            piecesMap.put(pianoPieces[0], new LinkedHashMap<>());
            piecesMap.get(pianoPieces[0]).put(pianoPieces[1], pianoPieces[2]);
        }
        String[] command = scanner.nextLine().split("\\|");
        while (!command[0].equals("Stop")) {
            switch (command[0]) {
                case "Add":
                    if (piecesMap.containsKey(command[1])) {
                        System.out.printf("%s is already in the collection!%n", command[1]);
                    } else {
                        piecesMap.put(command[1], new LinkedHashMap<>());
                        piecesMap.get(command[1]).put(command[2], command[3]);
                        System.out.printf("%s by %s in %s added to the collection!%n", command[1], command[2], command[3]);
                    }
                    break;
                case "Remove":
                    if (piecesMap.containsKey(command[1])) {
                        piecesMap.remove(command[1]);
                        System.out.printf("Successfully removed %s!%n", command[1]);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", command[1]);
                    }
                    break;
                case "ChangeKey":
                    if (piecesMap.containsKey(command[1])) {
                        for (Map.Entry<String, LinkedHashMap<String, String>> entry : piecesMap.entrySet()) {
                            if (entry.getKey().equals(command[1])) {
                                for (String e : entry.getValue().keySet()) {
                                    entry.getValue().put(e, command[2]);
                                }
                            }
                        }
                        System.out.printf("Changed the key of %s to %s!%n", command[1], command[2]);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", command[1]);
                    }
                    break;
            }
            command = scanner.nextLine().split("\\|");
        }
        for (Map.Entry<String, LinkedHashMap<String, String>> entry : piecesMap.entrySet()) {
            System.out.printf("%s -> ", entry.getKey());
            for (String e : entry.getValue().keySet()) {
                System.out.printf("Composer: %s, ", e);
            }
            for (String e : entry.getValue().values()) {
                System.out.printf("Key: %s%n", e);
            }

        }
    }
}
