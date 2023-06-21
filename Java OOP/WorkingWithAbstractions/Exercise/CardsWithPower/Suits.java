package JavaOOP.WorkingWithAbstraction.Exercise.CardsWithPower;

public enum Suits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);
    private int power;

    Suits(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
