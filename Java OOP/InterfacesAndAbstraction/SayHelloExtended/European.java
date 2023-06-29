package JavaOOP.IntefacesAndAbstraction.SayHelloExtended;

public class European extends BasePerson{
    private String name;

    public European(String name) {
        super(name);
    }

    public String sayHello() {
        return "Hello";
    }
}
