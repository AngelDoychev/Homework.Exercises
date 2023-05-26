package JavaAdvance.Generics.Exercise.GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
    }
public int count(T element){
        return (int) list.stream().filter(e->e.compareTo(element) > 0).count();
}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : list) {
            sb.append(String.format("%s: %s%n", value.getClass().getName(), value.toString()));
        }
        return sb.toString();
    }
}
