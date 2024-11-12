public class MainE9_13 {
    public static void main(String[] args) {
        EmployeeE9_13 employee = new EmployeeE9_13("Alice Green", 50000);
        ManagerE9_13 manager = new ManagerE9_13("Bob Brown", 75000, "Sales");
        ExecutiveE9_13 executive = new ExecutiveE9_13("Carol White", 100000, "Sales");

        System.out.println(employee.toString());
        System.out.println(manager.toString());
        System.out.println(executive.toString());
    }
}
