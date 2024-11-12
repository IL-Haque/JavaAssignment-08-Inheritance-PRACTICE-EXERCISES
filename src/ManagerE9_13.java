class ManagerE9_13 extends EmployeeE9_13 {
    private String department;

    public ManagerE9_13(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Manager[name=" + getName() + ", department=" + department + ", salary=" + getSalary() + "]";
    }
}
