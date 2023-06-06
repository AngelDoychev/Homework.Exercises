package JavaAdvance.IteratorsAndComperators.Exercise.StackIterator;

import java.util.*;

public class Stack implements Iterable<Integer> {
    private int currentTopIndex;
    private List<Integer> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public void push(Integer... elements) {
        if (elements.length > 0) {
            list.addAll(Arrays.asList(elements));
            this.currentTopIndex = list.size() - 1;
        }
    }

    public int getLength() {
        return this.list.size();
    }

    public Integer pop() {
        if (getLength() > 0) {
            Integer element = list.get(currentTopIndex);
            this.currentTopIndex--;
            this.list.remove(getLength() - 1);
            return element;
        }
        return 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index = list.size() - 1;
            boolean flag = false;

            @Override
            public boolean hasNext() {
                if (index < 0 && !flag) {
                    index = list.size() - 1;
                    flag = true;
                }
                return index >= 0;
            }

            @Override
            public Integer next() {
                return list.get(index--);
            }
        };
    }
}

