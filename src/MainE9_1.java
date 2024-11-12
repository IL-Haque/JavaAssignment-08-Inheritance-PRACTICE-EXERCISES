
public class MainE9_1 {
    public static void main(String[] args) {
    
        Employee emp = new Employee("Alice", 50000);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        Manager mgr = new Manager("Bob", 80000, 10000);
        System.out.println("\nManager Name: " + mgr.getName());
        System.out.println("Manager Base Salary: " + mgr.getBaseSalary());
        System.out.println("Manager Bonus: " + mgr.getBonus());
        System.out.println("Manager Total Salary: " + mgr.getSalary());

        mgr.setBonus(15000);
        System.out.println("\nUpdated Manager Bonus: " + mgr.getBonus());
        System.out.println("Updated Manager Total Salary: " + mgr.getSalary());
    }
}
