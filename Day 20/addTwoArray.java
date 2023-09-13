// WAP to add two array

import java.util.Scanner;

// Define a class named addTwoArray
public class addTwoArray {
    public static void main(String[] args) {

        // Declare variables
        int i;
        
        // Declare arrays to store 5 numbers each
        int[] a = new int[5]; // First input array
        int[] b = new int[5]; // Second input array
        int[] c = new int[5]; // Array to store the sum of corresponding elements

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter 5 numbers for Array One
        System.out.println("Enter 5 numbers for Array One:");

        // Read and store 5 numbers in the array 'a'
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        // Prompt the user to enter 5 numbers for Array Two
        System.out.println("Enter 5 numbers for Array Two:");

        // Read and store 5 numbers in the array 'b'
        for (i = 0; i < 5; i++) {
            b[i] = sc.nextInt();
        }
        
        // Display the entered numbers
        System.out.println("Addition of Two Arrays Is:");

        // Iterate through the arrays, calculate the sum of corresponding elements, and store in array 'c'
        for (i = 0; i < 5; i++) {
            c[i] = a[i] + b[i];
        	
            // Print the sum of corresponding elements
            System.out.println(a[i] +" + " + b[i] + " = " + c[i]);
        }
        
        // Close the Scanner to release resources
        sc.close();
    }
}
