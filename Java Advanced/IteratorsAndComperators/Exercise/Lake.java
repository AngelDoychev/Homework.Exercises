package JavaAdvance.IteratorsAndComperators.Exercise.Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> list;

    public Lake(Integer... elements) {
        this.list = new ArrayList<>(Arrays.asList(elements));
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Froggy();
    }

    class Froggy implements Iterator<Integer> {
        private int index = 0;
        boolean second = false;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public Integer next() {
            Integer element = list.get(index);
            index+=2;
            if (index>=list.size() && !second){
                index = 1;
                second = true;
            }
            return element;
        }
    }
}
