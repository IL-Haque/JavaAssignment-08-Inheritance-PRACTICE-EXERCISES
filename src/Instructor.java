class Instructor extends Person {
    private double salary;

    public Instructor(String name, int birthYear, double salary) {
        super(name, birthYear);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Instructor[name=" + getName() + ", birthYear=" + getBirthYear() + ", salary=" + salary + "]";
    }
}
