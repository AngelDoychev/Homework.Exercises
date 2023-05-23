package JavaAdvance.Generics.GenericArrayCreator;

public class Main {
    public static void main(String[] args) {
        String[] stringArr = ArrayCreator.<String>create(String.class, 5, "12");
        Integer[] numberArr = ArrayCreator.create(5, 12);
    }
}
