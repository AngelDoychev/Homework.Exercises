package JavaOOP.IntefacesAndAbstraction.Exercise.BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        List<Birthable> list = new ArrayList<>();
        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "Citizen":
                    Citizen currentCitizen = new Citizen(command[1], Integer.parseInt(command[2]), command[3], command[4]);
                    list.add(currentCitizen);
                    break;
                case "Robot":
                    Robot currentRobot = new Robot(command[1], command[2]);
                    break;
                case "Pet":
                    Pet currentPet = new Pet(command[1], command[2]);
                    list.add(currentPet);
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
        String wantedYear = scanner.nextLine();
        if (list.stream().anyMatch(e -> e.getBirthDate().endsWith(wantedYear))) {
            list.stream().filter(e -> e.getBirthDate().endsWith(wantedYear)).forEach(e -> System.out.println(e.getBirthDate()));
        } else {
            System.out.println("<no output>");
        }
    }
}
