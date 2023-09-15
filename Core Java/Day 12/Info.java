import java.util.*;

// Define a class called Info
class Info {
    // Declare instance variables
    String name;
    String sur_name;
    String address;
    String yaddress;
    int age1;
    int age;

    // Define a method to input information
    public void info() {
        Scanner sc = new Scanner(System.in);

        // Prompt and read college name
        System.out.print("Enter Your College Name:");
        sur_name = sc.nextLine();

        // Prompt and read college address
        System.out.print("Enter Your College Address:");
        yaddress = sc.nextLine();

        // Prompt and read parent's age
        System.out.print("Enter Your Parent's Age:");
        age1 = sc.nextInt();
    }

    // Define a method to print college name
    void tellName() {
        System.out.println("Your College Name:" + sur_name);
    }

    // Define a method to print college address
    void tellAddress() {
        System.out.println("Your College Address:" + yaddress);
    }

    // Define a method to print parent's age
    void tellAge() {
        System.out.println("Your parent's age is:" + age1);
    }

    // The main method where the program starts execution
    public static void main(String args[]) {
        // Create an instance of the Info class
        Info info = new Info();

        // Call the info method to input information
        info.info();

        // Set values for name, address, and age
        info.name = "Gaurav";
        info.address = "Nagpur, India";
        info.age = 23;

        // Print the values
        System.out.println("The Name of the boy is:" + info.name);
        System.out.println("The Address of the boy is:" + info.address);
        System.out.println("The Age of the boy is:" + info.age);

        // Call methods to print college name, address, and parent's age
        info.tellName();
        info.tellAddress();
        info.tellAge();
    }
}
