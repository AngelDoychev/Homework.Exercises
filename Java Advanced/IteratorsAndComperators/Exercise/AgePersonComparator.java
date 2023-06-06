package JavaAdvance.IteratorsAndComperators.Exercise.StrategyPattern;

import java.util.Comparator;

public class AgePersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
    }
}
