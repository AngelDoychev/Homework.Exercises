package JavaAdvance.IteratorsAndComperators.Exercise.StrategyPattern;

import javax.naming.Name;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        TreeSet<Person> nameSet = new TreeSet<>(new NamePersonComparator());
        TreeSet<Person> ageSet = new TreeSet<>(new AgePersonComparator());
        for (int i = 0; i < people; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            Person currentPerson = new Person(command[0], Integer.parseInt(command[1]));
            nameSet.add(currentPerson);
            ageSet.add(currentPerson);
        }
        for (Person person : nameSet) {
            System.out.println(person);
        }
        for (Person person : ageSet) {
            System.out.println(person);
        }
    }
}
