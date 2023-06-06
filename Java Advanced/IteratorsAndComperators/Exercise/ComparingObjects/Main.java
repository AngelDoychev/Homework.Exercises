package JavaAdvance.IteratorsAndComperators.Exercise.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] currentPersonInfo = scanner.nextLine().split("\\s+");
        List<Person> people = new ArrayList<>();
        while (!currentPersonInfo[0].equals("END")) {
            String currentName = currentPersonInfo[0];
            int currentAge = Integer.parseInt(currentPersonInfo[1]);
            String currentTown = currentPersonInfo[2];
            Person currentPerson = new Person(currentName, currentAge, currentTown);
            people.add(currentPerson);
            currentPersonInfo = scanner.nextLine().split("\\s+");
        }
        int matches = 0;
        Person personToMatch = people.get(Integer.parseInt(scanner.nextLine()) - 1);
        for (Person otherPerson : people) {
            if (personToMatch.compareTo(otherPerson) == 0) {
                matches++;
            }
        }
        if (matches == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d%n", matches, people.size() - matches, people.size());
        }
    }
}
