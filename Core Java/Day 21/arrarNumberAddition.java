// WAP to accept 7 numbers from users and add using array
import java.util.Scanner;

// Define a class named "arrarNumberAddition"
public class arrarNumberAddition {
    // Main method where the program execution starts
    public static void main(String args[]) {
        int sum = 0; // Variable to store the sum of array elements
        int[] arr = new int[7]; // Declare an integer array of size 7
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        System.out.println("Enter 7 Numbers");

        // Loop to read user input and populate the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Read an integer from the user
            sum = sum + arr[i]; // Add the entered number to the sum
        }
        
        // Print the sum of all array elements
        System.out.println("Addition is: " + sum);
        
        // Calculate and print the average of array elements
        System.out.println("Average of Array is: " + sum / 7);
    }
}
