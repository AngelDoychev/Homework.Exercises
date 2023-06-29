package JavaOOP.IntefacesAndAbstraction.Ferrari;

public class Ferrari implements Car{
    private String driverName;
    private String model = "488-Spider";

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", this.model, this.brakes(), this.gas(),  this.driverName);
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }
}
