package Fundametals.ObjectsAndClasses.Exercises.OrderbyAge;

public class Person {
    private String name;
    private String iD;
    private int age;

    public Person(String name, String iD, int age) {
        this.name = name;
        this.iD = iD;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.iD, this.age);
    }
}
