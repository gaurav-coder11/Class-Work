import java.util.*;

class PersonInfo {
    int id;
    String pName;

    // Method to accept input from the user
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name and ID: ");
        pName = sc.nextLine();
        id = sc.nextInt();
    }

    // Method to display the person's information
    public void display() {
        System.out.print("Your Name is " + pName + "\t" + " and ID: " + id);
    }

    public static void main(String args[]) {
        PersonInfo obj = new PersonInfo();
        obj.accept(); // Call the accept method to input data
        obj.display(); // Call the display method to show the information
    }
}
