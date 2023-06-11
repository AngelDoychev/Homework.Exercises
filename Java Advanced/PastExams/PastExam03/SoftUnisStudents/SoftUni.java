package JavaAdvance.PastExams.PastExam03.softUni;

import java.util.ArrayList;
import java.util.List;

public class SoftUni {
    private int capacity;
    private List<Student> data;

    public SoftUni(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCount() {
        return this.data.size();
    }

    public String insert(Student student) {
        if (data.size() < capacity) {
            for (Student currentStudent : data) {
                if (currentStudent == student) {
                    return "Student is already in the hall.";
                }
            }
            this.data.add(student);
            return String.format("Added student %s %s.", student.getFirstName(), student.getLastName());
        } else {
            return "The hall is full.";
        }
    }

    public String remove(Student student) {
        for (Student current : data) {
            if (current == student) {
                data.remove(current);
                return String.format("Removed student %s %s.", student.getFirstName(), student.getLastName());
            }
        }
        return "Student not found.";
    }

    public Student getStudent(String firstName, String lastName) {
        for (Student current : this.data) {
            if (current.getFirstName().equals(firstName) && current.getLastName().equals(lastName)) {
                return current;
            }
        }
        return null;
    }

    public String getStatistics() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Hall size: %d%n", this.data.size()));
        this.data.stream().map(e -> e + "\n").forEach(result::append);
        return result.toString();
    }
}
