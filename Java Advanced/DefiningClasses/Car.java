package JavaAdvance.DefiningClasses.Exercise.RawData;

public class Car {
    private String model;
    private int engineSpeed;
    private int enginePower;
    private int cargoWeight;
    private String type;
    private double[] tirePressure = new double[4];
    private int[] tireAge = new int[4];


    public Car(String model, int engineSpeed, int enginePower, int cargoWeight, String type
            , double tire1Pressure, int tire1Age
            , double tire2Pressure, int tire2Age
            , double tire3Pressure, int tire3Age
            , double tire4Pressure, int tire4Age) {
        this.model = model;
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
        this.cargoWeight = cargoWeight;
        this.type = type;
        this.tirePressure[0] = tire1Pressure;
        this.tirePressure[1] = tire2Pressure;
        this.tirePressure[2] = tire3Pressure;
        this.tirePressure[3] = tire4Pressure;
        this.tireAge[0] =  tire1Age;
        this.tireAge[1] =  tire2Age;
        this.tireAge[2] =  tire3Age;
        this.tireAge[3] =  tire4Age;
    }

    public String getModel() {
        return model;
    }

    public int getEngineSpeed() {
        return engineSpeed;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public String getType() {
        return type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineSpeed(int engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double[] getTirePressure() {
        return tirePressure;
    }

    public int[] getTireAge() {
        return tireAge;
    }

    public void setTirePressure(double[] tirePressure) {
        this.tirePressure = tirePressure;
    }

    public void setTireAge(int[] tireAge) {
        this.tireAge = tireAge;
    }
}
