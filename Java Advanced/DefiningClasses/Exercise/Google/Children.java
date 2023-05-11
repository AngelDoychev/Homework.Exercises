package JavaAdvance.DefiningClasses.Exercise.Google;

public class Children {
    private String name = "";
    private String birthday = "";

    @Override
    public String toString() {
        return String.format("%s %s", this.name, this.birthday);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }
}
