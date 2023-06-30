package JavaOOP.IntefacesAndAbstraction.Exercise.BirthdayCelebrations;

public class Citizen implements Birthable, Identifiable {
    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    public String getId() {
        return this.id;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
