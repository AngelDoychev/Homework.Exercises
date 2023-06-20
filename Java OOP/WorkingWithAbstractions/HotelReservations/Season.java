package JavaOOP.WorkingWithAbstraction.HotelReservations;

public enum Season {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);
    private int multiplier;

    Season(int multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
