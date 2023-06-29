package JavaOOP.IntefacesAndAbstraction.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        List<Identifiable> list = new ArrayList<>();
        while (!command[0].equals("End")) {
            if (command.length == 3) {
                Citizen currentCitizen = new Citizen(command[0], Integer.parseInt(command[1]), command[2]);
                list.add(currentCitizen);
            } else if (command.length == 2) {
                Robot currentRobot = new Robot(command[0], command[1]);
                list.add(currentRobot);
            }
            command = scanner.nextLine().split("\\s+");
        }
        String number = scanner.nextLine();
        list.stream().filter(e -> e.getId().endsWith(number)).forEach(e -> System.out.println(e.getId()));
    }
}
