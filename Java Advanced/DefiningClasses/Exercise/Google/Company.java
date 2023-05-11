package JavaAdvance.DefiningClasses.Exercise.Google;

public class Company {
    private String name = "";
    private String department = "";
    private double salary;

    @Override
    public String toString() {
        return String.format("Company:%n%s %s %.2f", this.name, this.department, this.salary);
    }
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
