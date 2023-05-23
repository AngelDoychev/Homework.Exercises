package JavaAdvance.Generics.GenericScale;


public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.right = right;
        this.left = left;
    }

    public T getHeavier() {
        if (left.compareTo(right) == 0) {
            return null;
        } else if (left.compareTo(right) > 0) {
            return left;
        } else {
            return right;
        }
    }
}
