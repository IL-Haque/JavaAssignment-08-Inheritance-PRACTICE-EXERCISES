class ExecutiveE9_13 extends ManagerE9_13 {

    public ExecutiveE9_13(String name, double salary, String department) {
        super(name, salary, department);
    }

    @Override
    public String toString() {
        return "Executive[name=" + getName() + ", department=" + getDepartment() + ", salary=" + getSalary() + "]";
    }
}
