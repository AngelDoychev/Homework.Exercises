package Fundametals.ObjectsAndClasses.Exercises.OrderbyAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAgeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        List<Person> peopleList = new ArrayList<>();
        while (!command[0].equals("End")) {
            Person person = new Person(command[0], command[1], Integer.parseInt(command[2]));
            peopleList.add(person);
            command = scanner.nextLine().split("\\s+");
        }
        peopleList.sort(Comparator.comparing(Person::getAge));
        for (Person person : peopleList) {
            System.out.println(person);
        }
    }
}
