package JavaAdvance.Generics.Exercise.Tuple;

public class Tuple<F, S> {
    private F first;
    private S second;

    @Override
    public String toString() {
        return String.format("%s -> %s", this.first.toString(), this.second.toString());
    }

    public Tuple(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
