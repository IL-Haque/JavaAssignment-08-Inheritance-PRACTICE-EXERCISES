class EmployeeE9_13 {
    private String name;
    private double salary;

    public EmployeeE9_13(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + ", salary=" + salary + "]";
    }
}
