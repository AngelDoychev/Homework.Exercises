package Fundametals.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
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

        public void setAge(String age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
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
            if (isAlreadyInList(firstName, lastName, studentsList)) {
                int index = getIndex(studentsList, firstName, lastName);
                studentsList.get(index).setAge(age);
                studentsList.get(index).setHomeTown(homeTown);

            } else {
                studentsList.add(student);
            }

            studentsArr = scanner.nextLine().split("\\s+");
        }
        String cityToPrint = scanner.nextLine();
        for (Student student : studentsList) {
            if (student.getHomeTown().equals(cityToPrint)) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    public static boolean isAlreadyInList(String firstName, String lastName, List<Student> studentList) {
        for (Student student : studentList) {
            if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
                return true;
            }
        }
        return false;
    }

    public static int getIndex(List<Student> studentsList, String firstName, String lastName) {
        int index = -1;
        for (int i = 0; i < studentsList.size(); i++) {
            Student student = studentsList.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                index = i;
            }
        }
        return index;
    }
}
