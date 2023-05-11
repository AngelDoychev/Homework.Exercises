package JavaAdvance.DefiningClasses.Exercise.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String currentName = command[0];
            int currentAge = Integer.parseInt(command[1]);
            Person currentPerson = new Person();
            currentPerson.setName(currentName);
            currentPerson.setAge(currentAge);
            people.add(currentPerson);
        }
        people.sort(Comparator.comparing(Person::getName));
        people.stream().filter(e -> e.getAge() > 30).forEach(e -> System.out.printf("%s - %d%n", e.getName(), e.getAge()));
    }
}
