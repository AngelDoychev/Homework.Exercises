package Fundametals.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String homeTown;

        public Student(String firstName, String lastName, String age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentsArr = scanner.nextLine().split("\\s+");
        List<Student> studentsList = new ArrayList<>();
        while (!studentsArr[0].equals("end")) {
            String firstName = studentsArr[0];
            String lastName = studentsArr[1];
            String age = studentsArr[2];
            String homeTown = studentsArr[3];
            Student student = new Student(firstName, lastName, age, homeTown);
            studentsList.add(student);
            studentsArr = scanner.nextLine().split("\\s+");
        }
        String cityToPrint = scanner.nextLine();
        for (Student student : studentsList) {
            if (student.getHomeTown().equals(cityToPrint)) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
