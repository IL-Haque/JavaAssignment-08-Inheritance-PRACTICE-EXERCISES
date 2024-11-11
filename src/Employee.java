
public class Employee {
    private String name;
    private double baseSalary;

    public Employee() {
        this.name = "";
        this.baseSalary = 0.0;
    }

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setBaseSalary(double newSalary) {
        this.baseSalary = newSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getSalary() {
        return baseSalary;
    }
}
