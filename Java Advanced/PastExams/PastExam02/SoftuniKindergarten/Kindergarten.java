package JavaAdvance.PastExams.PastExam02.kindergarten;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kindergarten {
    private String name;
    private int capacity;
    private List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public boolean addChild(Child child) {
        if (registry.size() < capacity) {
            registry.add(child);
            return true;
        }
        return false;
    }

    public boolean removeChild(String name) {
        Child current = null;
        for (Child child : registry) {
            if (child.getFirstName().equals(name)) {
                current = child;
                registry.remove(current);
                return true;
            }
        }
        return false;
    }

    public int getChildrenCount() {
        return registry.size();
    }

    public Child getChild(String name) {
        for (Child child : registry) {
            if (child.getFirstName().equals(name)) {
                return child;
            }
        }
        return null;
    }

    public String registryReport() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Registered children in %s:%n", this.name));
        Comparator<Child> comparator = Comparator.comparing(Child::getAge)
                .thenComparing(Child::getFirstName)
                .thenComparing(Child::getLastName);
        registry.stream().sorted(comparator).map(e -> e.toString() + "\n").forEach(result::append);
        return result.toString();
    }
}
