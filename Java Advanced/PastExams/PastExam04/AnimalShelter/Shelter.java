package JavaAdvance.PastExams.PastExam04.shelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private int capacity;
    private List<Animal> data;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Animal animal) {
        if (this.data.size() < capacity) {
            this.data.add(animal);
        }
    }
    public boolean remove(String name){
        for (Animal current : data) {
            if (current.getName().equals(name)){
                data.remove(current);
                return true;
            }
        }
        return false;
    }
    public Animal getAnimal(String name, String caretaker){
        for (Animal current : data) {
            if (current.getName().equals(name)&&current.getCaretaker().equals(caretaker)){
                return current;
            }
        }
        return null;
    }
    public Animal getOldestAnimal(){
        Animal oldest = new Animal("temp", Integer.MIN_VALUE, "temp");
        for (Animal current : data) {
            if (current.getAge()>oldest.getAge()){
                oldest = current;
            }
        }
        return oldest;
    }
    public int getCount(){
        return this.data.size();
    }
    public String getStatistics(){
        StringBuilder result = new StringBuilder();
        result.append("The shelter has the following animals:\n");
        for (Animal current : data) {
            result.append(current.getName());
            result.append(" ");
            result.append(current.getCaretaker());
            result.append("\n");
        }
        return result.toString().trim();
    }
}
