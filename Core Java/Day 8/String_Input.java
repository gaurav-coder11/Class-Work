//wap to user input as a string
import java.util.Scanner;

class String_Input {
    public static void main(String args[]) {
        String str1, str2, str3 = "Hello"; // Declare string variables

        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        System.out.print("Enter Your First Name: ");
        str1 = sc.nextLine(); // Read the user's first name

        System.out.print("Enter Your Second Name: ");
        str2 = sc.nextLine(); // Read the user's second name

        System.out.println("Welcome!!! " + str1 + " " + str2); // Concatenate and print a welcome message

        if (str1.equals(str2)) { // Check if the two strings are equal
            System.out.print("Both the strings are equal");
        } else {
            System.out.print("Both the strings are not equal");
        }
    }
}
