package JavaAdvance.Workshop.Lab;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {
    private static final int INITIAL_CAPACITY = 4;
    private int capacity;
    private int size;
    private int[] items;

    public CustomStack() {
        this.capacity = INITIAL_CAPACITY;
        this.size = 0;
        this.items = new int[this.capacity];
    }

    public int getSize() {
        return this.size;
    }

    public void push(int element) {
        if (this.size >= this.capacity) {
            this.resize();
        }
        this.items[this.size] = element;
        this.size++;
    }

    public int pop() {
        checkEmpty();
        int element = this.items[this.size - 1];
        this.items[this.size - 1] = 0;
        this.size--;
        if (this.size <= this.capacity / 4) {
            shrink();
        }
        return element;
    }

    public int peek() {
        checkEmpty();
        return this.items[this.size - 1];
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.items[i]);
        }
    }

    private void checkEmpty() {
        if (this.size == 0) {
            throw new NoSuchElementException("CustomStack is empty");
        }
    }

    private void resize() {
        this.capacity *= 2;
        int[] copyArr = new int[this.capacity];
        for (int i = 0; i < this.items.length; i++) {
            copyArr[i] = this.items[i];
        }
        this.items = copyArr;
    }

    private void shrink() {
        this.capacity /= 2;
        int[] copyArr = new int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            copyArr[i] = this.items[i];
        }
        this.items = copyArr;
    }
}
