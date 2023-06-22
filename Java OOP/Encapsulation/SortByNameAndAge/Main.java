package JavaOOP.Encapsulation.SortByNameAndAge;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws IOException {
            Scanner reader = new Scanner(System.in);
            int n = Integer.parseInt(reader.nextLine());
            List<Person> people = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String[] input = reader.nextLine().split(" ");
                people.add(new Person(input[0], input[1], Integer.parseInt(input[2])));
            }
            Collections.sort(people, (firstPerson, secondPerson) -> {
                int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
                if (sComp != 0) {
                    return sComp;
                } else {
                    return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
                }
            });
            for (Person person : people) {
                System.out.println(person.toString());
            }
        }

}
