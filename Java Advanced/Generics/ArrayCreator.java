package JavaAdvance.Generics.GenericArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {
    public static <T> T[] create(int length, T element) {
        T[] current = (T[]) Array.newInstance(element.getClass(), length);
        for (int i = 0; i < length; i++) {
            current[i] = element;
        }
        return current;
    }

    public static <T> T[] create(Class<T> myClass, int length, T element) {
        T[] current = (T[]) Array.newInstance(myClass, length);
        for (int i = 0; i < length; i++) {
            current[i] = element;
        }
        return current;
    }
}
