package JavaOOP.Encapsulation.Exercise.FootballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(";");
        Map<String, Team> teamMap = new LinkedHashMap<>();
        while (!"END".equals(command[0])) {
            try {
                switch (command[0]) {
                    case "Team":
                        Team currentTeam = new Team(command[1]);
                        teamMap.put(command[1], currentTeam);
                        break;
                    case "Add":
                        if (teamMap.containsKey(command[1])) {
                            Player currentPlayer = new Player(command[2], Integer.parseInt(command[3]),
                                    Integer.parseInt(command[4]), Integer.parseInt(command[5]),
                                    Integer.parseInt(command[6]), Integer.parseInt(command[7]));
                            teamMap.get(command[1]).addPlayer(currentPlayer);
                        } else {
                            System.out.printf("Team %s does not exist.%n", command[1]);
                        }
                        break;
                    case "Remove":
                        if (teamMap.containsKey(command[1])) {
                            teamMap.get(command[1]).removePlayer(command[2]);
                        } else {
                            System.out.printf("Team %s does not exist.%n", command[1]);
                        }
                        break;
                    case "Rating":
                        if (teamMap.containsKey(command[1])) {
                            System.out.printf("%s - %.0f%n", command[1], teamMap.get(command[1]).getRating());
                        } else {
                            System.out.printf("Team %s does not exist.%n", command[1]);
                        }
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            command = scanner.nextLine().split(";");
        }
    }
}
