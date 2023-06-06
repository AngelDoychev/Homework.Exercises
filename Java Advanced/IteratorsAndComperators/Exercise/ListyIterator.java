package JavaAdvance.IteratorsAndComperators.Exercise.ListyIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListyIterator<String> {
    private List<String> list;
    private int currentIndex;
    public ListyIterator(String... elements) {
        if (elements.length==0){
            this.list = new ArrayList<>();
        }else {
            currentIndex = 0;
            this.list = new ArrayList<>(Arrays.asList(elements));
        }
    }
    public String print(int index){
        return this.list.get(index);
    }
    public int getLength(){
        return this.list.size();
    }

    public String getCurrent(){
        return this.list.get(currentIndex);
    }
        public boolean hasNext() {
            return this.currentIndex < list.size()-1;
        }

        public boolean next() {
            if (hasNext()){
                currentIndex++;
                return true;
            }else {
                return false;
            }
    }
}
