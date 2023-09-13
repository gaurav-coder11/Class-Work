// write a program to array initialization
import java.util.Scanner;

// Define a class named arrayClass
public class arrayClass {
    public static void main(String [] args) {

        // Declare variables
        int i;
        int [] a = new int[5];

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter 5 numbers
        System.out.println("Enter 5 numbers:");

        // Read and store 5 numbers in the array 'a'
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        // Display the entered numbers
        System.out.println("Entered Numbers:");

        // Iterate through the array and print each entered number
        for (i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
