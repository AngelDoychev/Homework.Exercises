package JavaAdvance.IteratorsAndComperators.Exercise.StrategyPattern;

import java.util.Comparator;

public class NamePersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        if (firstPerson.getName().length() == secondPerson.getName().length()) {
            return Character.compare(firstPerson.getName().toLowerCase().charAt(0), secondPerson.getName().toLowerCase().charAt(0));
        } else {
            return firstPerson.getName().length() - secondPerson.getName().length();
        }
    }
}
