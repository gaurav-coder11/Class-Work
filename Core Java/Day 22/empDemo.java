import Empdetails.Emp; // Import the Emp class from the Empdetails package
import java.util.Scanner;

public class empDemo {
    public static void main(String[] args) {
        int id;
        String name;
        String designation;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Id: ");
        id = sc.nextInt();

        System.out.println("Enter Your Name: ");
        sc.nextLine(); // Consume the newline character left by previous nextInt()
        name = sc.nextLine();

        System.out.println("Enter Your Designation: ");
        designation = sc.nextLine();

        // Create an Emp object with the entered employee details
        Emp emp = new Emp(id, name, designation);

        // Call the display method of the Emp object to show the employee details
        emp.display();
    }
}
