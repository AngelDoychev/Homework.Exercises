package JavaAdvance.DefiningClasses.Exercise.Google;

public class Pokemon {
    private String name = "";
    private String type = "";

    @Override
    public String toString() {
        return String.format("%s %s", this.name, this.type);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
