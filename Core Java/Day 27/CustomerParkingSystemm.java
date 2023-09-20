import java.util.*;

// Define a Customer class to represent customer information
class Customer {
    String name;
    int flatNo;
    boolean parkingPreference;
    int parkingSlot;

    // Constructor to initialize customer details
    Customer(String name, int flatNo, boolean parkingPreference) {
        this.name = name;
        this.flatNo = flatNo;
        this.parkingPreference = parkingPreference;
        this.parkingSlot = -1;
    }

    // Method to assign a parking slot to a customer
    void assignParking(int parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    // Method to display customer details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Flat No: " + flatNo);
        System.out.println("Parking Preference: " + (parkingPreference ? "Yes" : "No"));
        if (parkingPreference) {
            System.out.println("Allocated Parking Slot: " + parkingSlot);
        }
        System.out.println();
    }
}

public class CustomerParkingSystemm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();
        HashSet<Integer> allocatedFlats = new HashSet<>();

        // Prompt the user to enter the number of customers
        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Loop to input customer details
        for (int i = 0; i < numCustomers; i++) {
            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();

            System.out.print("Enter flat number: ");
            int flatNo = scanner.nextInt();

            // Check if the flat number is already allocated
            if (allocatedFlats.contains(flatNo)) {
                System.out.println("Flat " + flatNo + " is already allocated.");
                continue;  // Skip this customer
            }

            System.out.print("Do you want parking? (yes/no): ");
            boolean parkingPreference = scanner.next().equalsIgnoreCase("yes");

            Customer customer = new Customer(name, flatNo, parkingPreference);
            customers.add(customer);
            allocatedFlats.add(flatNo);

            // If parking is preferred, input the parking slot
            if (parkingPreference) {
                System.out.print("Enter parking slot number: ");
                int parkingSlot = scanner.nextInt();
                customer.assignParking(parkingSlot);
            }

            scanner.nextLine();  // Consume the newline character
            System.out.println();
        }

        // Display customer details
        System.out.println("\nCustomer Details:");
        for (Customer customer : customers) {
            customer.displayDetails();
        }
    }
}
