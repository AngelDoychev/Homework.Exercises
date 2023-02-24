package Fundametals.ObjectsAndClasses.Exercises.GroomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity) {
        this.data = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Pet pet) {
        if (data.size() < this.capacity) {
            data.add(pet);
        }
    }

    public boolean remove(String petName) {
        for (Pet pet : data) {
            if (pet.getName().equals(petName)) {
                data.remove(pet);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (Pet pet : data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                return pet;
            }
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        String full = "";
        for (Pet pet : data) {
            full += pet.getName() + " " + pet.getOwner() + "\n";
        }
        return "The grooming salon has the following clients:" + "\n" + full;

    }
}
