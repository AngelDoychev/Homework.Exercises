package JavaOOP.Encapsulation.FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split(" ");
            Person currentPerson = new Person(info[0], info[1], Integer.parseInt(info[2]), Double.parseDouble(info[3]));
            people.add(currentPerson);
        }
        Team team = new Team("Black Eagles");
        for (Person person : people) {
            team.addPlayer(person);
        }
        System.out.printf("First team have %d players%nReserve team have %d players", team.getFirstTeam().size(), team.getReserveTeam().size());
    }
}
