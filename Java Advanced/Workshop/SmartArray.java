package JavaAdvance.Workshop.Lab;

import java.util.function.Consumer;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }

    public void add(int element) {
        if (this.size == this.capacity) {
            this.resize();
        }
        this.data[this.size++] = element;
    }

    public int get(int index) {

        validateIndex(index);

        return this.data[index];
    }

    public boolean contains(int element) {

        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }

    public int remove(int index) {
        this.validateIndex(index);
        int element = this.data[index];
        this.shiftLeft(index);
        this.size--;
        if (this.size <= this.capacity / 4) {
            this.shrink();
        }
        return element;
    }

    public void add(int index, int element) {
        validateIndex(index);
    }

    private void shrink() {
        this.capacity /= 2;
        int[] newData = new int[this.capacity];

        for (int i = 0; i < this.size; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }

    private void shiftLeft(int index) {
        for (int i = index; index < this.size - 1; index++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[size - 1] = 0;
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void resize() {
        this.capacity *= 2;
        int[] newData = new int[this.capacity];

        for (int i = 0; i < this.size; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }

}
