package Fundametals.ObjectsAndClasses.Exercises.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<Student> studentsList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            double grade = Double.parseDouble(command[2]);
            Student student = new Student(command[0], command[1], grade);
            studentsList.add(student);
        }
        studentsList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : studentsList) {
            System.out.println(student);
        }
    }
}
