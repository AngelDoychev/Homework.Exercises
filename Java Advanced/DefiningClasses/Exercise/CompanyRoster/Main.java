package JavaAdvance.DefiningClasses.Exercise.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employeesList = new ArrayList<>();
        double highestAverage = Double.MIN_VALUE;
        String highestDepartment = "";
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            if (command.length == 4) {
                Employee currentEmployee = new Employee(command[0], Double.parseDouble(command[1]), command[2], command[3]);
                employeesList.add(currentEmployee);
            } else if (command.length == 5 && Character.isDigit(command[4].charAt(0))) {
                Employee currentEmployee = new Employee(command[0], Double.parseDouble(command[1]), command[2], command[3], Integer.parseInt(command[4]));
                employeesList.add(currentEmployee);
            } else if (command.length == 5) {
                Employee currentEmployee = new Employee(command[0], Double.parseDouble(command[1]), command[2], command[3], command[4]);
                employeesList.add(currentEmployee);
            } else if (command.length == 6) {
                Employee currentEmployee = new Employee(command[0], Double.parseDouble(command[1]), command[2], command[3], command[4], Integer.parseInt(command[5]));
                employeesList.add(currentEmployee);
            }
        }
        HashMap<String, Double> departmentMap = new HashMap<>();
        for (Employee current : employeesList) {
            if (!departmentMap.containsKey(current.getDepartment())) {
                departmentMap.put(current.getDepartment(), 0.0);
            }
            departmentMap.put(current.getDepartment(), departmentMap.get(current.getDepartment()) + current.getSalary());
        }
        for (Map.Entry<String, Double> entry : departmentMap.entrySet()) {
            if (highestAverage < entry.getValue()) {
                highestAverage = entry.getValue();
                highestDepartment = entry.getKey();
            }
        }
        List<Employee> highestList = new ArrayList<>();
        for (Employee current : employeesList) {
            if (current.getDepartment().equals(highestDepartment)) {
                highestList.add(current);
            }
        }
        System.out.println("Highest Average Salary: " + highestDepartment);
        highestList.sort(Comparator.comparing(Employee::getSalary).reversed());
        highestList.stream().forEach(e -> System.out.printf("%s %.2f %s %d %n", e.getName(), e.getSalary(), e.getEmail(), e.getAge()));
    }
}
