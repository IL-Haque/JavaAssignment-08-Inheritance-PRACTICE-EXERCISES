public class MainE9_12 {
    public static void main(String[] args) {
        Person person = new Person("Alex Smith", 1980);
        Student student = new Student("Emily Johnson", 2000, "Computer Science");
        Instructor instructor = new Instructor("Dr. John Doe", 1975, 85000);

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(instructor.toString());
    }
}
