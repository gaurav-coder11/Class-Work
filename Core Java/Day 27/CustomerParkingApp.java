/*
WAP to accept customer details as name ,flatno,parking (yes/no),if yes then allocate parking with 
flat number and display all customers details
*/
import java.util.*;

// Define a Customer class to represent customer information
class Customer {
    String name;
    int flatNumber;
    boolean requiresParking;
    int parkingSlot;

    // Constructor to initialize customer details
    Customer(String name, int flatNumber, boolean requiresParking) {
        this.name = name;
        this.flatNumber = flatNumber;
        this.requiresParking = requiresParking;
        this.parkingSlot = -1;
    }

    // Method to allocate a parking slot to a customer
    void allocateParking(int parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    // Method to display customer details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Flat Number: " + flatNumber);
        System.out.println("Parking Required: " + (requiresParking ? "Yes" : "No"));
        if (requiresParking) {
            System.out.println("Allocated Parking Slot: " + parkingSlot);
        }
        System.out.println();
    }
}

public class CustomerParkingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();

        // Prompt the user to enter the number of customers
        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Loop to input customer details
        for (int i = 0; i < numCustomers; i++) {
            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();
            scanner.nextLine(); // Consume the newline

            System.out.print("Enter flat number: ");
            int flatNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            System.out.print("Does the customer require parking? (yes/no): ");
            String parkingChoice = scanner.nextLine();

            boolean requiresParking = parkingChoice.equalsIgnoreCase("yes");

            // Create a Customer object and add it to the list
            Customer customer = new Customer(name, flatNumber, requiresParking);
            customers.add(customer);

            // If parking is required, input the allocated parking slot
            if (requiresParking) {
                System.out.print("Enter allocated parking slot: ");
                int parkingSlot = scanner.nextInt();
                customer.allocateParking(parkingSlot);
            }

            System.out.println();
        }

        // Display customer details
        System.out.println("Customer Details:");
        for (Customer customer : customers) {
            customer.displayDetails();
        }

        scanner.close();
    }
}
