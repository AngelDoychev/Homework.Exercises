package JavaAdvance.IteratorsAndComperators.Exercise.ComparingObjects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    @Override
    public int compareTo(Person otherPerson) {
        int checkIfNameMatches = this.getName().compareTo(otherPerson.name);
        if (checkIfNameMatches == 0) {
            int checkIfAgeMatches = Integer.compare(this.getAge(), otherPerson.age);
            if (checkIfAgeMatches == 0) {
                int checkIfTownMatches = this.getTown().compareTo(otherPerson.town);
                if (checkIfTownMatches == 0) {
                    return 0;
                }
            }
        }
        return -1;
    }
}
