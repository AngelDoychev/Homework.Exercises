package JavaAdvance.Generics.Exercise.CustomListSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public void remove(int index) {
        this.list.remove(index);
    }

    public boolean contains(T element) {
        return this.list.contains(element);
    }

    public void swap(int index1, int index2) {
        T temp = this.list.get(index1);
        this.list.set(index1, this.list.get(index2));
        this.list.set(index2, temp);
    }

    public int countGreaterThan(T element) {
        return (int) this.list.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax() {
        T max = Collections.max(this.list);
        return max;
    }

    public T getMin() {
        T min = Collections.min(this.list);
        return min;
    }
    public int size(){
        return this.list.size();
    }
    public T get(int index){
        return this.list.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder();
        for (T value : this.list){
            sb.append(value).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
