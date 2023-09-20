public class Employee {
    int empcode;
    String name;
    String city;

    // Constructor to initialize employee details
    public Employee(int empcode, String name, String city) {
        this.empcode = empcode;
        this.name = name;
        this.city = city;
    }

    // Override the toString method to provide custom string representation
    public String toString() {
        return empcode + " " + name + " " + city;
    }

    public static void main(String args[]) {
        // Create two Employee objects
        Employee e1 = new Employee(350, "Rohan", "Kolkata");
        Employee e2 = new Employee(351, "Priya", "Noida");

        // Print the details of the employees using the overridden toString method
        System.out.println(e1);
        System.out.println(e2);
    }
}
